package controller;

import dao.VoivodeshipDao;
import entity.Voivodeship;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@AllArgsConstructor
public class VoivodeshipController {

//    private final VoivodeshipDao voivodeshipDao;
//
//    @GetMapping(path = "voivodeship/add", produces = "text/html;charset=UTF-8")
//    String showAddForm(Model model) {
//        model.addAttribute("voivodeship", new Voivodeship());
//        return "voivodeship/voivodeship";
//    }
//
//    @PostMapping(path = "voivodeship/add", produces = "text/html;charset=UTF-8")
//    String processAddForm(@Valid Voivodeship voivodeship, BindingResult result) {
//        if (result.hasErrors()) {
//            return "voivodeship/voivodeship";
//        }
//        voivodeshipDao.create(voivodeship);
//        return "redirect:/voivodeship/voivodeship";
//    }
//

}
