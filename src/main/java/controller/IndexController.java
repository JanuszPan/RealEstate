package controller;

import entity.Apartments;
import entity.Voivodeship;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import repository.VoivodeshipRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@AllArgsConstructor
public class IndexController {
//    private final ApartmentsRepository apartmentsRepository;

    private final VoivodeshipRepository voivodeshipRepository;

    @GetMapping(path = "/", produces = "text/html; charset=UTF-8")
    public String hello(Model model) {
        model.addAttribute("apartments", new Apartments());
        return "index";
    }
    @PostMapping(path = "/", produces = "text/html; charset=UTF-8")
    public String first(Model model) {
        model.addAttribute("apartments", Arrays.asList(new Apartments()));
        return "apartments/apartmentsView";
    }
    @ModelAttribute("voivodeship")
    public List<Voivodeship> checkOptions() {
        return voivodeshipRepository.findAll();
    }

}

