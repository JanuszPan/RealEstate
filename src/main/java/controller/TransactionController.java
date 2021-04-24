package controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

public class TransactionController {
    @ModelAttribute("transaction")
    public List<String> checkOptions() {
        String[] a = new String[] {"sprzedaż", "najem"};
        return Arrays.asList(a);
    }
}
