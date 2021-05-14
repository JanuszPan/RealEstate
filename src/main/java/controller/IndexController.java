package controller;

import entity.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import repository.CityRepository;
import repository.DistrictRepository;
import repository.TransactionRepository;
import repository.VoivodeshipRepository;
import java.util.Arrays;
import java.util.List;


@Controller
@AllArgsConstructor
public class IndexController {

    private final VoivodeshipRepository voivodeshipRepository;
    private final TransactionRepository transactionRepository;
    private final CityRepository cityRepository;
    private final DistrictRepository districtRepository;


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

