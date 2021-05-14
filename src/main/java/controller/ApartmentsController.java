package controller;

import dao.ApartmentsDao;
import entity.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import repository.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@AllArgsConstructor
public class ApartmentsController {
    private final ApartmentsRepository apartmentsRepository;
    private final VoivodeshipRepository voivodeshipRepository;
    private final CityRepository cityRepository;
    private final DistrictRepository districtRepository;
    private final TransactionRepository transactionRepository;
//    private final ApartmentsDao apartmentsDao;

    //dodawanie mieszkania
    @GetMapping(path = "apartments/add", produces = "text/html;charset=UTF-8")
    public String showAddForm(Model model) {
        model.addAttribute("apartments", new Apartments());
        return "apartments/add";
    }
    @PostMapping(path = "apartments/add", produces = "text/html;charset=UTF-8")
    public String processAddForm(@Valid Apartments apartments, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "apartments/add";
        }
        apartmentsRepository.save(apartments);
        return "redirect:/apartments";
    }

    @GetMapping(path = "apartments", produces = "text/html;charset=UTF-8")
    String showAllApartments(Model model) {
        List<Apartments> apartments = apartmentsRepository.findAll();
        model.addAttribute("apartments", apartments);
        return "apartments/apartmentsView";
    }
//    @PostMapping(path = "/apartments/add")
//    public String submit(@RequestParam("file") MultipartFile file, ModelMap modelMap) {
//        modelMap.addAttribute("file", file);
//        return "apartments/apartmentsView";
//    }

    //edytowanie mieszkania
//    @GetMapping(path = "apartments/edit", produces = "text/plain;charset=UTF-8")
//    String showEditForm(Model model, @RequestParam long id) {
//        Apartments apartments = apartmentsRepository.findApartmentsById(id);
//        model.addAttribute("apartments", apartments);
//        return "apartments/edit";
//    }
//    @PostMapping(path = "apartments/edit", produces = "text/html;charset=UTF-8")
//    String processEditForm(@Valid Apartments apartments, BindingResult result) {
//        if (result.hasErrors()) {
//            return "apartments/edit";
//        }
//        apartmentsRepository.save(apartments);
//        return "redirect:/apartments/apartments";
//    }

    @PostMapping(path = "/apartments", produces = "text/html;charset=UTF-8")
    String findAllApartmentsByRooms(@RequestParam("rooms") int rooms, Model model) {
        List<Apartments> apartments = apartmentsRepository.findAllByRooms(rooms);
        model.addAttribute("rooms", rooms);
        return "apartments/apartments";
    }
    @ModelAttribute("voivodeship")
    public List<Voivodeship> checkOptionsVoiv() {
        return voivodeshipRepository.findAll();
    }

    @ModelAttribute("district")
    public List<District> checkOptionsDistrict() {
        return districtRepository.findAll();
    }

    @ModelAttribute("city")
    public List<City> checkOptionsCity() {
        return cityRepository.findAll();
    }

    @ModelAttribute("transaction")
    public List<Transaction> checkOptionsTrans() {
        return transactionRepository.findAll();
    }

}
