package com.cg.capstore.daoTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import com.cg.capstore.dao.ShippingDetailsDaoImpl;
import com.cg.capstore.model.Details;

public class ShippingDetailsDaoImplTest {

	static Details details;

	static ShippingDetailsDaoImpl shippingDao ;
	@BeforeAll
	public static void Obj() {
		details = new Details();
		shippingDao = new ShippingDetailsDaoImpl();
		
	}
	
	@Test
	public void test() {
		details.setShippingId(4);
		details.setCity("hyd");
		details.setCustName("shiva");
		details.setHouseNumber("123");
		details.setPincode(123);
		details.setState("telangana");
		details.setStreet("mehdipatnam");
		assertEquals(4, shippingDao.storeShippingDetails(details));
		
	}

}
