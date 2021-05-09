package repository;

import dao.VoivodeshipDao;
import entity.Voivodeship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

public interface VoivodeshipRepository extends JpaRepository<Voivodeship, Long> {

}

