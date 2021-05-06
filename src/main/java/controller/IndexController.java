package controller;

import entity.Apartments;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @GetMapping(path = "/", produces = "text/html; charset=UTF-8")
    public String hello(Model model) {
        model.addAttribute("apartments", new Apartments());
        return "index";
    }

}

