package com.example.demo.reference_Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class RandomTransactionGenerator {
    public static void main(String[] args) {
        List<Transaction> objects = getRandomTransactions();
        for (Transaction object : objects) {
            System.out.println("id: " + object.getId() + " name: " + object.getName());
        }
    }
    public static List<Transaction> getRandomTransactions() {
        List<Transaction> objects = new ArrayList<>();
        for (int i = 0; i < NUM_OBJECTS; i++) {
            objects.add(new Transaction(generateRandomName()));
        }
        return objects;
    }

    private static String generateRandomName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < NAME_LENGTH; i++) {
            int index = random.nextInt(ALPHANUMERIC_CHARS.length());
            sb.append(ALPHANUMERIC_CHARS.charAt(index));
        }
        return sb.toString();
    }
}
