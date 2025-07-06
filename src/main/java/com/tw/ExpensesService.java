package com.tw;

import java.util.*;

public class ExpensesService {

    private final List<Expenses> expenses;
    private final Map<String, Double> balances = new HashMap<>();

    public ExpensesService(List<Expenses> expenses) {
        this.expenses = expenses;
    }

    public void calculateBalance() {

        for (Expenses expense : expenses) {
            int amount = expense.getAmount();
            List<String> participants = expense.getParticipants();
            if (participants == null || participants.isEmpty()) {
                throw new IllegalArgumentException("Participants cannot be empty");
            }
            String payer = expense.getPayer();
            double share = (double) amount / participants.size();
            for (String person : participants) {
                balances.put(person, balances.getOrDefault(person, 0.0) - share);
            }
            balances.put(payer, balances.getOrDefault(payer, 0.0) + amount);
        }
    }

    public List<String> settleBalances() {
        List<String> transactions = new ArrayList<>();
        PriorityQueue<Map.Entry<String, Double>> debtors = new PriorityQueue<>(Comparator.comparingDouble(Map.Entry::getValue));
        PriorityQueue<Map.Entry<String, Double>> creditors = new PriorityQueue<>((a, b) -> Double.compare(b.getValue(), a.getValue()));

        for (Map.Entry<String, Double> entry : balances.entrySet()) {
            double value = Math.round(entry.getValue() * 100.0) / 100.0;
            if (value < 0) {
                debtors.add(Map.entry(entry.getKey(), value));
            } else if (value > 0) {
                creditors.add(Map.entry(entry.getKey(), value));
            }
        }
        while (!debtors.isEmpty() && !creditors.isEmpty()) {
            Map.Entry<String, Double> debtor = debtors.poll();
            Map.Entry<String, Double> creditor = creditors.poll();

            double debit = -debtor.getValue();
            double credit = creditor.getValue();
            double amount = Math.min(debit, credit);
            amount = Math.round(amount); // Round to nearest integer

            transactions.add(debtor.getKey() + " pays " + creditor.getKey() + " " + (int) amount);

            double newDebit = debtor.getValue() + amount;
            double newCredit = creditor.getValue() - amount;

            if (Math.abs(newDebit) > 0.01)
                debtors.add(Map.entry(debtor.getKey(), newDebit));
            if (Math.abs(newCredit) > 0.01)
                creditors.add(Map.entry(creditor.getKey(), newCredit));
        }

        return transactions;
    }
}
