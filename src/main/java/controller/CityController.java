package controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

public class CityController {
    @ModelAttribute("city")
    public List<String> checkOptions() {
        String[] a = new String[] {"Kraków", "Wieliczka", "Niepołomice", "Bochnia"};
        return Arrays.asList(a);
    }
}
