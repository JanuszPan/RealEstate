package repository;

import entity.Land;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandRepository extends JpaRepository<Land, Long> {
}
