package com.cg.capstore.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//to autoconfigure the component classes
@ComponentScan("com.cg.capstore.controller")
@ComponentScan("com.cg.capstore.dao")
@ComponentScan("com.cg.capstore.model")
@ComponentScan("com.cg.capstore.service")
//entityscan annotation to auto configure the entity class 
@EntityScan(basePackages = {"com.cg.capstore.model"})
//for component scanning of bean classes
@SpringBootApplication
public class ShippingDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingDetailsApplication.class, args);
	}

}
