package com.example.demo.service.implementation;

import com.example.demo.model.Client;
import com.example.demo.model.Transaction;
import com.example.demo.repo.ClientRepo;
import com.example.demo.repo.TransactionRepo;
import com.example.demo.service.AppService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class AppServiceImpl implements AppService {

        private final ClientRepo clientRepo;
        private final TransactionRepo transactionRepo;

        @Override
        public Collection<Client> getAllClients() {
            log.info("getAllClients() called");
            return clientRepo.findAll();
        }

        @Override
        public Collection<Transaction> getAllTransactions() {
            log.info("getAllTransactions() called");
            return transactionRepo.findAll();
        }

}
