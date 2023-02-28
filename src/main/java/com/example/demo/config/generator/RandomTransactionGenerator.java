package com.example.demo.config.generator;

import com.example.demo.model.Client;
import com.example.demo.model.Transaction;

import java.util.*;

public class RandomTransactionGenerator {
    private static final int NUM_OBJECTS = 4000;
    private static Random random = new Random();
    public static void main(String[] args) {
        List<Transaction> objects = getRandomTransactions();
        for (Transaction object : objects) {
            System.out.println("id: " + object.getId() + " from: " + object.getFrom() + " to: " + object.getTo() + " Ticker: " + object.getTicker() + " amount: " + object.getAmount() + " price: " + object.getPrice() + " date: " + object.getDate() + " TradeId: " + object.getTradeId());
        }
    }

    private static List<Transaction> getRandomTransactions() {
        List<Transaction> objects = new ArrayList<>();
        RandomClientGenerator clientGenerator = new RandomClientGenerator();
        int i = 1;
        while (i <= NUM_OBJECTS) {
            int fromId = random.nextInt(50) + 1;
            int toId = random.nextInt(50) + 1;
            while (fromId == toId) {
                fromId = random.nextInt(50) + 1;
            }

            String ticker = clientGenerator.generateRandomName();
            int amount = random.nextInt(1000) + 1;
            double price = random.nextDouble(50000000.00);

            // Set the date to a random future date
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(Calendar.DAY_OF_MONTH, new Random().nextInt(30) + 1); // Add between 1 and 30 days
            Date date = calendar.getTime();

            String tradeId = null;

            objects.add(new Transaction(i, fromId, toId, ticker, amount, price, date, tradeId)); // copilot suggestions: [transaction_id, client_id_to, price, date]
            objects.add(new Transaction(++i, toId, fromId, ticker, amount, price, date, tradeId)); //manually added
            i++;
        }
        return objects;
    }

}
