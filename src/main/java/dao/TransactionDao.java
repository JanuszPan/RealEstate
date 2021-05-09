package dao;

import entity.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TransactionDao {
    @PersistenceContext
    EntityManager entityManager;

    public void create(Transaction transaction) {
        entityManager.persist(transaction);
    }
    public void update(Transaction transaction) { entityManager.merge(transaction); }
    public Transaction findById(long id) { return entityManager.find(Transaction.class, id); }
    public void delete(Transaction transaction) {
        entityManager.remove(entityManager.contains(transaction) ? transaction : entityManager.merge(transaction));
    }
}
