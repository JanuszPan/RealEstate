package app;

import controller.IndexController;
import converter.StringToVoivodeshipController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import repository.ApartmentsRepository;

import javax.persistence.EntityManagerFactory;
import javax.validation.Validator;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = IndexController.class)// Spring Data - wystarczy jeden przedstawiciel z pakietu
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = ApartmentsRepository.class)
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean entityManagerFactoryBean
                = new LocalEntityManagerFactoryBean();
        entityManagerFactoryBean.setPersistenceUnitName("springHibernatePersistenceUnit");
        return entityManagerFactoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager jpaTransactionManager =
                new JpaTransactionManager(entityManagerFactory);
        return jpaTransactionManager;
    }

    @Bean
    //Dzi??ki zdefiniowaniu ViewResolver oraz prefiksu i sufiksu zamiast zwraca?? z kontrolera pe??nej nazwy i ??cie??ki do widoku:
    //return "/WEB-INF/views/index.jsp"; b??dziemy mogli zwraca?? tylko jego nazw??:return "index";
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean(name = "localeResolver")
    public LocaleContextResolver getLocaleContextResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("pl", "PL"));
        return localeResolver;
    }

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }


    @Override//Kodowanie @ResponseBody
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
        stringConverter.setSupportedMediaTypes(Arrays.asList(new MediaType("text", "plain",
                Charset.forName("UTF-8"))));
        converters.add(stringConverter);
    }

    @Override
//Bez tego ustawienia dla zasob??w statycznych (obrazki, js, css) Spring pr??bowa??by dopasowa?? metod?? kontrolera, kt??ra pasowa??aby np. do adresu /logo.jpg
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //SpringSecurity
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/auth/login").setViewName("auth/login");
//        registry.addViewController("/auth/403page").setViewName("auth/403page");
//    }
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(getPublisherConverter());
    }

    @Bean
    public StringToVoivodeshipController getPublisherConverter() {
        return new StringToVoivodeshipController();
    }

    //    This MultipartResolver comes with a series of set method to define properties such as the maximum size for uploads:
    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(100000);
        return multipartResolver;
    }
}

