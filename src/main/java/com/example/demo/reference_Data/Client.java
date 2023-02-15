package com.example.demo.reference_Data;

import jakarta.persistence.*;

//create a class called Client
@Entity//Manually
@Table(name = "client")//Manually
public class Client {
    //add few fields: id, name with 4Digit Alphanumeric Copilot suggestion
    @Id//Manually
    @SequenceGenerator(//Manually
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(//Manually
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    private int id;
    private String name; //4 Digit Alphanumeric

    //add a constructor
    public Client(String name) {
        this.id = id;
        this.name = name;
    }

    public Client() {
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

    //add toString method
    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + "]";
    }
}
