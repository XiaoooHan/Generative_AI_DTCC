package com.example.demo.reference_Data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id//Manually
    @SequenceGenerator(//Manually
            name = "transaction_sequence",
            sequenceName = "transaction_sequence",
            allocationSize = 1
    )
    @GeneratedValue(//Manually
            strategy = GenerationType.SEQUENCE,
            generator = "transaction_sequence"
    )
    private int id;
    private Client from;
    private Client to; // Copilot suggestion
    private int amount;// Copilot suggestion
    private double priceInUSD;
    private Date tradeDate;
    private String tradeId;
    private String ticker;

    //Copilot suggestion
    public Transaction(Client from, Client to, int amount, double priceInUSD, Date tradeDate, String tradeId, String ticker) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.priceInUSD = priceInUSD;
        this.tradeDate = tradeDate;
        this.ticker = ticker;
        this.tradeId = null;
    }

    public Transaction() {

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
