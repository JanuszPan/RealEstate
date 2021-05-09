package dao;

import entity.Apartments;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ApartmentsDao {
    @PersistenceContext
    EntityManager entityManager;

    public void create(Apartments apartment) {
        entityManager.persist(apartment);
    }
    public void update(Apartments apartment) { entityManager.merge(apartment); }
    public Apartments findById(long id) { return entityManager.find(Apartments.class, id); }
    public void delete(Apartments apartment) {
        entityManager.remove(entityManager.contains(apartment) ? apartment : entityManager.merge(apartment));
    }

}
