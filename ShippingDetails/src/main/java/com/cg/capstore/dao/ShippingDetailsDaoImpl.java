package com.cg.capstore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.capstore.model.Details;
//Repository represents that class provides machanism for storage,retrieval and update
@Repository
//Component is used for indicating class as component and is for dependency injection
@Component("shippingDao")
public class ShippingDetailsDaoImpl implements ShippingDetailsDao{
	int shippingId;
	//Manages all the entity objects
	@PersistenceContext
	EntityManager entityManager;
	//method for storing form values entered by the user into the database
	@Override
	public int storeShippingDetails(Details details) {
		shippingId = details.getShippingId();
		entityManager.persist(details);
		return shippingId;
	}

}
