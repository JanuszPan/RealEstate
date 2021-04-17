package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @GetMapping(path = "/hello", produces = "text/html; charset=UTF-8")
    public String hello() {
        return "index";
    }
}

