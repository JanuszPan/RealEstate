package controller;

import entity.Apartments;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repository.ApartmentsRepository;

import java.util.List;

@Controller
@AllArgsConstructor
public class IndexController {
//    private final ApartmentsRepository apartmentsRepository;

    @GetMapping(path = "/", produces = "text/html; charset=UTF-8")
    public String hello(Model model) {
        model.addAttribute("apartments", new Apartments());
        return "index";
    }
//    @PostMapping(path = "/apartments", produces = "text/html;charset=UTF-8")
//    String findAllApartmentsByRooms(@RequestParam("rooms") int rooms, Model model) {
//        List<Apartments> apartments = apartmentsRepository.findAllByRooms(rooms);
//        model.addAttribute("rooms", rooms);
//        return "apartments/apartments";
//    }

}

