package dao;

import entity.City;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CityDao {
    @PersistenceContext
    EntityManager entityManager;

    public void create(City city) {
        entityManager.persist(city);
    }
    public void update(City city) {
        entityManager.merge(city);
    }
    public City findById(long id) {
        return entityManager.find(City.class, id);
    }
    public void delete(City city) {
        entityManager.remove(entityManager.contains(city) ? city : entityManager.merge(city));
    }
}
