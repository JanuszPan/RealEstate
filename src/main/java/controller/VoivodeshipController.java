package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class VoivodeshipController {
    @ModelAttribute("voivodeship")
    public List<String> checkOptions() {
        String[] a = new String[] {"dolnośląskie", "kujawsko-pomorskie", "lubelskie", "lubuskie","łódzkie","małopolskie", "mazowieckie","opolskie","podkarpackie","poslaskie","pomorskie",
                "śląskie","świętokrzyskie","warmińsko-mazurskie","wielkopolskie","zachodniopomorskie"};
        return Arrays.asList(a);
    }
}
