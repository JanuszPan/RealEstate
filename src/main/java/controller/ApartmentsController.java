//package controller;
//
//import entity.Apartments;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import repository.ApartmentsRepository;
//
//import java.util.List;
//
//@Controller
//@AllArgsConstructor
//public class ApartmentsController {
//    private final ApartmentsRepository apartmentsRepository;
//
//
////    wyświetlanie formularza dodawania mieszkania
//    @GetMapping(path = "add/apartments", produces = "text/html;charset=UTF-8")
//    String showAddForm(Model model) {
//        model.addAttribute("apartment", new Apartments());
//        return "apartments/add";
//    }

//    @PostMapping(path = "/apartments", produces = "text/html;charset=UTF-8")
//    String findAllApartmentsByRooms(@RequestParam("rooms") int rooms, Model model) {
//        List<Apartments> apartments = apartmentsRepository.findAllByRooms(rooms);
//        model.addAttribute("rooms", rooms);
//        return "apartments/apartments";
//    }
//    @PostMapping(path = "/apartment", produces = "text/html;charset=UTF-8")
//    public String processForm(Apartments apartment, Model model) {
//        model.addAttribute("rooms", rooms);
//        return "apartments/apartments";
//    }


//}
