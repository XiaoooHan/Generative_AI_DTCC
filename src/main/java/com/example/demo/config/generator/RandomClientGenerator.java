package com.example.demo.config.generator;

import com.example.demo.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//ChatGPT generated this code
public class RandomClientGenerator {
    private static final int NUM_OBJECTS = 50;
    private static final int NAME_LENGTH = 4;
    private static final String ALPHANUMERIC_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static Random random = new Random();

    public static void main(String[] args) {
        List<Client> objects = getRandomClients();
        for (Client object : objects) {
            System.out.println("id: " + object.getId() + " name: " + object.getName());
        }
    }
    public static List<Client> getRandomClients() {
        List<Client> objects = new ArrayList<>();
        for (int i = 0; i < NUM_OBJECTS; i++) {
            objects.add(new Client(i,generateRandomName()));
        }
        return objects;
    }

    static String generateRandomName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < NAME_LENGTH; i++) {
            int index = random.nextInt(ALPHANUMERIC_CHARS.length());
            sb.append(ALPHANUMERIC_CHARS.charAt(index));
        }
        return sb.toString();
    }
}
