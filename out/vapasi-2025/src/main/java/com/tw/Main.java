package com.tw;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Expenses> expensesList = List.of(
                new Expenses("A", 100, List.of("A", "B", "C", "D")),
                new Expenses("B", 500, List.of("C", "D")),
                new Expenses("D", 300, List.of("A", "B"))
        );
        List<Expenses> expenses = List.of(
                new Expenses("A", 100, List.of("A", "B", "C", "D")),
                new Expenses("A", 100, List.of("A", "B", "C", "D"))
        );
        ExpensesService service = new ExpensesService(expensesList);
        service.calculateBalance();
        List<String> result = service.settleBalances();

        System.out.println("List of transactions:Case1 ");
        for (String t : result) {
            System.out.println(t);
        }

        ExpensesService service1 = new ExpensesService(expenses);
        service1.calculateBalance();
        List<String> result1 = service1.settleBalances();
        System.out.println("List of transactions:Case2 ");
        for (String t : result1) {
            System.out.println(t);
        }
    }
}
