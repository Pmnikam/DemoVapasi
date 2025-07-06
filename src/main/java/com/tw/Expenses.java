package com.tw;

import java.util.List;

public class Expenses {
    private final String payer;
    private final int amount;
    private final List<String> participants;

    public Expenses(String payer, int amount, List<String> participants) {
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
