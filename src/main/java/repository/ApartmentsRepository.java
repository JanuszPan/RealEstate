package repository;

import entity.Apartments;
import entity.City;
import entity.District;
import entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApartmentsRepository extends JpaRepository<Apartments, Long> {

    Apartments findApartmentsById(Long id);
    List<Apartments> findAllByRooms(int rooms);
    List<Apartments> findAllByArea(int area);
    List<Apartments> findAllByAreaBetween(int areaMin, int areaMax);
    List<Apartments> findAllByAreaAfter(int area);
    List<Apartments> findAllByBathroomsAfter(int number);
    List<Apartments>findAllByTransaction(Transaction transaction);
    List<Apartments> findAllByCity(City city);
    List<Apartments>findAllByDistrict(District district);


}


