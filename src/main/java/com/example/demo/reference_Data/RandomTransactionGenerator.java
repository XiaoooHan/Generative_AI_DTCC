package com.example.demo.reference_Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
public class RandomTransactionGenerator {
    private static ClientRepository clientRepository;
    private static TickerRepository tickerRepository;
    private static Random random = new Random();
    private static final int NUM_OBJECTS = 50;
    private static double curSinglePrice = 0;
    private static int curAmount = 0;
    public static void main(String[] args) {
        List<Transaction> objects = getRandomTransactions();
        for (Transaction object : objects) {
            System.out.println("id: " + object.getID() + " From Name: " + object.getFrom().getName() + "To Name" + object.getTo().getName() + " Ticker: " + object.getTicker()
                                + " amout: " + object.getAmount() + " price: " + object.getPriceInUSD() + " date: " + object.getTradeDate());

        }
    }
    public static List<Transaction> getRandomTransactions() {
        List<Transaction> objects = new ArrayList<>();
        for (int i = 0; i < NUM_OBJECTS; i++) {
            objects.add(new Transaction(i,getRandomFromName(),getRandomToName(),getAmount(),getPrice(),getDate(),getTicker()));
        }
        return objects;
    }
    //To Name
    private static Client getRandomToName(){
        int index = random.nextInt(2000);
        Client to = clientRepository.findClientByID(index);
        return to;
    }
    //From Name
    private static Client getRandomFromName(){
        int index = random.nextInt(2000);
        Client from = clientRepository.findClientByID(index);
        return from;
    }

    //amout
    private static int getAmount(){
        int amount = random.nextInt(10000);
        curAmount = amount;
        return amount;
    }
    //ticker
    private static String getTicker(){
        int index = random.nextInt(5000);
        String ticker = tickerRepository.findTickerByID(index);
        curSinglePrice = tickerRepository.findSinglePriceByID(index);
        return ticker;
    }

    private static double getPrice(){
        return curAmount * curSinglePrice;
    }
    private static String getDate(){
        StringBuilder sb = new StringBuilder();
        int year = random.nextInt(10) + 2023;
        sb.append(year);
        int month = random.nextInt(12) + 1;
        sb.append(month);
        int day = random.nextInt(29) + 1;
        sb.append(day);
        return sb.toString();
    }


}
