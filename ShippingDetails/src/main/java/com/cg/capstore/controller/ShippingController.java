package com.cg.capstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capstore.model.Details;
import com.cg.capstore.service.ShippingDetailsService;
//cross origin is used for resource sharing
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
//rest controller is used to convert java object to json or xml
@RestController
public class ShippingController {
//autowire annotation is used to connect and share resources of other class if the bean is matching
		@Autowired
		ShippingDetailsService shippingService;
	//request mapping is used to map the http handle requests	
		@RequestMapping(value = "/store", method = RequestMethod.POST)
		public int storeDetails(@RequestBody  Details details) {
			return shippingService.storeShippingDetails(details);			
		}

	
	
}
