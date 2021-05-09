package controller;

import dao.TransactionDao;
import entity.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
public class TransactionController {
    private final TransactionController transactionController;

    @ModelAttribute("transaction")
    public List<String> checkOptions() {
        String[] a = new String[] {"sprzedaż", "najem", "dzierżawa"};
        return Arrays.asList(a);
    }
}
