package com.tw;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Expenses> expensesList = List.of(
                new Expenses("A", 100, List.of("A", "B", "C", "D")),
                new Expenses("B", 500, List.of("C", "D")),
                new Expenses("D", 300, List.of("A", "B"))
        );
        ExpensesService service = new ExpensesService(expensesList);
        service.calculateBalance();
        List<String> result = service.settleBalances();

        System.out.println("List of transactions: ");
        for (String t : result) {
            System.out.println(t);
        }
    }
}
