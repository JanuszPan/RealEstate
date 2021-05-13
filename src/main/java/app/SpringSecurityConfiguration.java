//package app;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import repository.ApartmentsRepository;
//import service.CustomUserDetailsService;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//@EnableWebSecurity
//@ComponentScan(basePackageClasses = CustomUserDetailsService.class)
//@EnableJpaRepositories(basePackageClasses = {ApartmentsRepository.class})
//public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Bean
//    public LocalEntityManagerFactoryBean entityManagerFactory() {
//        LocalEntityManagerFactoryBean entityManagerFactoryBean
//                = new LocalEntityManagerFactoryBean();
//        entityManagerFactoryBean.setPersistenceUnitName("springHibernatePersistenceUnit");
//        return entityManagerFactoryBean;
//    }
//
//    @Bean
//    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//        JpaTransactionManager jpaTransactionManager =
//                new JpaTransactionManager(entityManagerFactory);
//        return jpaTransactionManager;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
////     return  NoOpPasswordEncoder.getInstance();//nie jest już wspierana
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUsername("root");
//        dataSource.setPassword("coderslab");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/real_estate?serverTimezone=UTC");
//        return dataSource;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
////                .csrf().disable()// HttpSecurity, nie wyłącza się, bo zabezpiecza przed atakiem
//                .exceptionHandling().accessDeniedPage("/auth/403page")
//                .and()
//                .authorizeRequests()
//                .antMatchers("/apartments/add")
//                .hasAuthority("ADMIN")
//                .antMatchers("/")
//                .anonymous()
//                .anyRequest().authenticated()
//                .and()
//                .logout().logoutUrl("/auth/logout").logoutSuccessUrl("/auth/login")
//                .and()
//                .formLogin().loginPage("/auth/login").usernameParameter("email").successForwardUrl("/apartments/add")
//                .permitAll();
//    }
//}