package repository;

import entity.Apartments;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ApartmentsRepository extends JpaRepository<Apartments, Long> {
    Apartments findById(int id);

    //metoda wyszukująca mieszkania dla zadanej liczby pokoi.
    List<Apartments> findAllByRooms(int rooms);

}


