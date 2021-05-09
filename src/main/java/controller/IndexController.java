package controller;

import entity.Apartments;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@AllArgsConstructor
public class IndexController {
//    private final ApartmentsRepository apartmentsRepository;

    @GetMapping(path = "/", produces = "text/html; charset=UTF-8")
    public String hello(Model model) {
        model.addAttribute("apartments", new Apartments());
        return "index";
    }
    @PostMapping(path = "/", produces = "text/html; charset=UTF-8")
    public String first(Model model) {
        model.addAttribute("apartments",new Apartments());
        return "apartments/apartmentsView";
    }

}

