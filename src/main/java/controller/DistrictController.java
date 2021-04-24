package controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

public class DistrictController {
    @ModelAttribute("district")
    public List<String> checkOptions() {
        String[] a = new String[] {"Śródmieście", "Krowodrza", "Podgórze", "Nowa Huta"};
        return Arrays.asList(a);
    }
}
