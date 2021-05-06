package controller;

import entity.Apartments;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repository.ApartmentsRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
public class ApartmentsController {
    private final ApartmentsRepository apartmentsRepository;

    //dodawanie mieszkania
    @GetMapping(path = "apartments/form", produces = "text/plain;charset=UTF-8")
    String showAddForm(Model model) {
        model.addAttribute("apartments", new Apartments());
        return "apartments/add";
    }
    @PostMapping(path = "apartments/form", produces = "text/html;charset=UTF-8")
    String processAddForm(@Valid Apartments apartments, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "apartments/add";
        }
        apartmentsRepository.save(apartments);
        return "redirect:/apartments/apartments";
    }
    //szukanie mieszkania po numerze oferty (id)
    @GetMapping(path = "/apartments/id", produces = "text/html;charset=UTF-8")
    String findApartmentByID(@RequestParam("id") Long id, Model model) {
        Apartments apartments = apartmentsRepository.findApartmentsById(id);
        model.addAttribute("id", id);
        return "apartments/apartments";
    }

    @PostMapping(path = "/apartments/id", produces = "text/html;charset=UTF-8")
    String findApByID(@RequestParam("id") Long id, Model model) {
        Apartments apartments = apartmentsRepository.findApartmentsById(id);
        model.addAttribute("id", id);
        return "apartments/apartments";
    }

    @PostMapping(path = "/apartments", produces = "text/html;charset=UTF-8")
    String findAllApartmentsByRooms(@RequestParam("rooms") int rooms, Model model) {
        List<Apartments> apartments = apartmentsRepository.findAllByRooms(rooms);
        model.addAttribute("rooms", rooms);
        return "apartments/apartments";
    }

}
