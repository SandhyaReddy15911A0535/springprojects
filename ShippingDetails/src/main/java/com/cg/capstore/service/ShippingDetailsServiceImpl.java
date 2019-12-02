package com.cg.capstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capstore.dao.ShippingDetailsDaoImpl;
import com.cg.capstore.model.Details;
//defines scope of database transaction
@Transactional
//Indicated that class is a service class
@Service
@Component("shippingService")
public class ShippingDetailsServiceImpl implements ShippingDetailsService{

	@Autowired
	ShippingDetailsDaoImpl shippingDao;
	//method which returns dao method to controller
	@Override
	public int storeShippingDetails(Details details) {
		
		return shippingDao.storeShippingDetails(details);
	}

	
}
