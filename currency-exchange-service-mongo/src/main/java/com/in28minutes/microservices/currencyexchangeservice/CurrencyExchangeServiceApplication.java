package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.in28minutes.microservices.currencyexchangeservice.entity.CurrencyExchange;
import com.in28minutes.microservices.currencyexchangeservice.repository.CurrencyExchangeMongorepository;

@SpringBootApplication
@EnableMongoRepositories
public class CurrencyExchangeServiceApplication implements CommandLineRunner {
	
	@Autowired
	CurrencyExchangeMongorepository repo;

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		CurrencyExchange c1 = new CurrencyExchange(10001L, "USD", "INR", new BigDecimal(65));
		CurrencyExchange c2 = new CurrencyExchange(10002L, "AUD", "INR", new BigDecimal(53));
		CurrencyExchange c3 = new CurrencyExchange(10003L, "EUR", "INR", new BigDecimal(84));
		
		repo.save(c1);
		repo.save(c2);
		repo.save(c3);
	}

}
