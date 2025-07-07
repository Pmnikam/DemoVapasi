package com.tw;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        List<String> result = service.settleBalances();

        List<String> expected = List.of(
                "C pays B 275",
                "A pays B 50",
                "A pays D 25"
        );

        assertTrue(result.containsAll(expected));
        assertEquals(expected.size(), result.size());
    }

    @Test
    public void testCase2() {
        List<Expenses> expenses = List.of(
                new Expenses("A", 100, List.of("A", "B", "C", "D")),
                new Expenses("A", 100, List.of("A", "B", "C", "D"))
        );
        ExpensesService service = new ExpensesService(expenses);
        service.calculateBalance();
        List<String> result = service.settleBalances();

        List<String> expected = List.of(
                "B pays A 50",
                "C pays A 50",
                "D pays A 50"
        );

        assertTrue(result.containsAll(expected));
        assertEquals(expected.size(), result.size());
    }
}

