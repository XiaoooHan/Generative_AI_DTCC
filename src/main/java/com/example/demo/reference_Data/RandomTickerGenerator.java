package com.example.demo.reference_Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTickerGenerator {
    private static final int NUM_OBJECTS = 50;
    private static final int NAME_LENGTH = 4;
    private static final String ALPHANUMERIC_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static Random random = new Random();
    public static void main(String[] args) {
        List<Ticker> objects = getRandomTickers();
        for (Ticker object : objects) {
            System.out.println("id: " + object.getId() + " name: " + object.getName() + " price: " + object.getPrice());
        }
    }
    public static List<Ticker> getRandomTickers() {
        List<Ticker> objects = new ArrayList<>();
        for (int i = 0; i < NUM_OBJECTS; i++) {
            objects.add(new Ticker(generateRandomName(),generateRandomPrice()));
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
    private static double generateRandomPrice() {
        //tmp number for good datas
        double price = random.nextDouble(5000);
        return price;
    }
}
