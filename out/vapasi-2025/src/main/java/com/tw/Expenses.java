package com.tw;

import java.util.List;

public class Expenses {
    private final String payer;
    private final int amount;
    private final List<String> participants;

    public Expenses(String payer, int amount, List<String> participants) {
        if (payer == null || payer.isBlank()) {
            throw new IllegalArgumentException("Payer cannot be null or empty");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        if (participants == null || participants.isEmpty()) {
            throw new IllegalArgumentException("Participants list cannot be null or empty");
        }
        this.payer = payer;
        this.amount = amount;
        this.participants = participants;
    }

    public String getPayer() {
        return payer;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> getParticipants() {
        return participants;
    }
}
