package dao;

import entity.Voivodeship;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class VoivodeshipDao {
    @PersistenceContext
    EntityManager entityManager;

    public void create(Voivodeship voivodeship) {
        entityManager.persist(voivodeship);
    }
    public void update(Voivodeship voivodeship) { entityManager.merge(voivodeship); }
    public Voivodeship findById(long id) { return entityManager.find(Voivodeship.class, id); }
    public void delete(Voivodeship voivodeship) {
        entityManager.remove(entityManager.contains(voivodeship) ? voivodeship : entityManager.merge(voivodeship));
    }

}
