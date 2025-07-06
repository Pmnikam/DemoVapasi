package com.tw;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExpenseServiceTest {
    @Test
    public void testSample() {
        List<Expenses> expensesList = List.of(
                new Expenses("A", 100, List.of("A", "B", "C", "D")),
                new Expenses("B", 500, List.of("C", "D")),
                new Expenses("D", 300, List.of("A", "B"))
        );
        ExpensesService service = new ExpensesService(expensesList);
        service.calculateBalance();
        List<String> transactions = service.settleBalances();

        assertTrue(transactions.contains("B pays A 25"));
        assertTrue(transactions.contains("C pays A 25"));
        assertTrue(transactions.contains("D pays A 25"));
        assertTrue(transactions.contains("C pays B 250"));
        assertTrue(transactions.contains("D pays B 250"));
        assertTrue(transactions.contains("A pays D 150"));
        assertTrue(transactions.contains("B pays D 150"));
    }
}
