package com.liveEasy.Logistic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liveEasy.dao.ShipmentDao;

@SpringBootApplication(scanBasePackages={
		"com.liveEasy.controllers", "com.liveEasy.dao","com.liveEasy.service","com.liveEasy.Utils"})
public class LogisticApplication {

	@Autowired
	private ShipmentDao shipment;
	public static void main(String[] args) {
		SpringApplication.run(LogisticApplication.class, args);
	}
//	@Override
//	public void run(String... args)throws Exception{
//		this.shipment.createTable();
//	}

}
