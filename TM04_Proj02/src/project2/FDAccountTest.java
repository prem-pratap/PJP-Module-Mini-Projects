package project2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FDAccountTest {
	FDAccount obj;
	@Before
	public void setUp() throws Exception {
		obj=new FDAccount();
		obj.setAmount(20000);
		obj.setAgeOfACHolder(25);
		obj.setNoOfDays(91);
	}

	@Test
	public void testCalculateInterest() {
		
		assertEquals(1500,obj.calculateInterest(),0.0);
	}

	

	@Test
	public void testSetNoOfDays() {
		obj.setNoOfDays(35);
		assertEquals(35,obj.getNoOfDays());
	}
	@Test
	public void testGetNoOfDays() {
		assertEquals(91,obj.getNoOfDays());
	}

	@Test
	public void testSetAgeOfACHolder() {
		obj.setAgeOfACHolder(29);
		assertEquals(29,obj.getAgeOfACHolder());
	}
	
	@Test
	public void testGetAgeOfACHolder() {
		assertEquals(25,obj.getAgeOfACHolder());
	}
	
	@Test
	public void testGetSetInterestRate() {
		obj.setInterestRate(0.0750);
		assertEquals(0.0750,obj.getInterestRate(),0.0);
	}
	
	


	@Test
	public void testGetAmount() {
		assertEquals(20000,obj.getAmount(),0.0);
	}

	@Test
	public void testSetAmount() {
		obj.setAmount(10000);
		double d = 10000.0;
		assertEquals(d,obj.getAmount(),0.0);
	}
}
