package com.example.demo.reference_Data;

import jakarta.persistence.*;

//create a class called Client
public class Client {
    //add few fields: id with 4Digit Alphanumeric, name
    private String id;//4 Digit Alphanumeric
    private String name;

    //add a constructor
    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }
    //add getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
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
