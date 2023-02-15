package com.example.demo.reference_Data;

import java.util.Date;

public class Transaction {
    private Client from;
    private Client to; // Copilot suggestion
    private int amount;// Copilot suggestion
    private double priceInUSD;
    private Date tradeDate;
    private String tradeId;

    //Copilot suggestion
    public Transaction(Client from, Client to, int amount, double priceInUSD, Date tradeDate, String tradeId) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.priceInUSD = priceInUSD;
        this.tradeDate = tradeDate;
        this.tradeId = null;
    }
    public Client getFrom() {
        return from;
    }

    public Client getTo() {
        return to;
    }

    public int getAmount() {
        return amount;
    }

    public double getPriceInUSD() {
        return priceInUSD;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }


}
