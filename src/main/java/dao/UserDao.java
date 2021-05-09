package dao;

import entity.District;
import entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserDao {
    @PersistenceContext
    EntityManager entityManager;

    public void create(User user) {
        entityManager.persist(user);
    }
    public void update(User user) { entityManager.merge(user); }
    public User findById(long id) { return entityManager.find(User.class, id); }
    public void delete(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }

}
