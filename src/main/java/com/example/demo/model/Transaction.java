package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; //primary key: Copilot detected a primary key. Copilot Suggestions: [transaction_id]

    private int fromId; // Copilot Suggestions: [client_id_from]
    private int toId; // Copilot Suggestions: [client_id_to]
    private String Ticker;
    private int amount;
    private double price;// Copilot Suggestions: [price]
    private Date date;// Copilot Suggestions: [date]
    private String TradeId;

    public void setTradeId(String tradeId) {
        TradeId = tradeId;
    }

    public String getTradeId() {
        return TradeId;
    }
}
