package com.in28minutes.microservices.currencyexchangeservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.in28minutes.microservices.currencyexchangeservice.entity.CurrencyExchange;

public interface CurrencyExchangeMongorepository extends MongoRepository<CurrencyExchange, Long> {
	
	CurrencyExchange findByFromAndTo(String from,String to);

}
