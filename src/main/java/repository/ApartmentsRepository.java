package repository;

import entity.Apartments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface ApartmentsRepository extends JpaRepository<Apartments, Long> {
    //metodę wyszukującą mieszkania dla zadanego liczby pokoi.
    List<Apartments> findAllByRooms(Apartments rooms);



}


