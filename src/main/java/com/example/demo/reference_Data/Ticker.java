package com.example.demo.reference_Data;

import jakarta.persistence.*;


@Entity//Manually
@Table(name = "ticker")//Manually
public class Ticker {
    //add few fields: id, name with 4Digit Alphanumeric Copilot suggestion
    @Id//Manually
    @SequenceGenerator(//Manually
            name = "ticker_sequence",
            sequenceName = "ticker_sequence",
            allocationSize = 1
    )
    @GeneratedValue(//Manually
            strategy = GenerationType.SEQUENCE,
            generator = "ticker_sequence"
    )
    private double price;
    private int id;
    private String name; //4 Digit Alphanumeric

        //add a constructor
    public Ticker(String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
    }

    public Ticker() {

    }

        //add getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Ticker [id=" + id + ", name=" + name + "price = " + price + "]";
    }
}
