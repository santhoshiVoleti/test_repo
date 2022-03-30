package com.zensar;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessAppTest {

	@Test
	public void testBusinessApp() {
		CityService cityService = new CityServiceStub();//new CityServiceImpl();
		
		LoginService loginService = new LoginServiceStub();
		
		BusinessApp businessApp = new BusinessApp(cityService,loginService);
		assertEquals(businessApp.retrieveCityListByCountry("INDIA").size(),3);
		
		equals(businessApp.login("tommy", "1234567890"));
	}

}
