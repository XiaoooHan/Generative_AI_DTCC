package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; //primary key: Copilot detected a primary key. Copilot Suggestions: [transaction_id]

    @NotEmpty(message = "Please provide a client from name")
    private int from;
    @NotEmpty(message = "Please provide a client to name")
    private int to; // Copilot Suggestions: [client_id_to]
    @NotEmpty(message = "Please provide a ticker")
    private String Ticker;
    @NotEmpty(message = "Please provide a amount")
    private int amount;
    @NotEmpty(message = "Please provide a price")
    private double price;// Copilot Suggestions: [price]
    @NotEmpty(message = "Please provide a date")
    private String date;// Copilot Suggestions: [date]
    private String TradeId;


}
