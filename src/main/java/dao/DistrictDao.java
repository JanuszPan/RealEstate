package dao;

import entity.Apartments;
import entity.District;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DistrictDao {
    @PersistenceContext
    EntityManager entityManager;

    public void create(District district) {
        entityManager.persist(district);
    }
    public void update(District district) { entityManager.merge(district); }
    public District findById(long id) { return entityManager.find(District.class, id); }
    public void delete(District district) {
        entityManager.remove(entityManager.contains(district) ? district : entityManager.merge(district));
    }
}
