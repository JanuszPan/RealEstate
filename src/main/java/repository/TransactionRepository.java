package repository;

import entity.Apartments;
import entity.Transaction;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
