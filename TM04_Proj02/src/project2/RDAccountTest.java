package project2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RDAccountTest {
	RDAccount obj;
	@Before
	public void setUp() throws Exception {
		obj =new RDAccount();
		obj.setAmount(4000);
		obj.setAgeOfACHolder(24);
		obj.setNoOfMonth(15);
	}

	@Test
	public void testCalculateInterest() {
		assertEquals(330.0,obj.calculateInterest(),0.0);
	}

	@Test
	public void testGetSetInterestRate() {
		obj.setInterestRate(0.050);
		assertEquals(0.050,obj.getInterestRate(),0.0);
	}


	@Test
	public void testGetAmount() {
		assertEquals(4000, obj.getAmount(),0.0);
	}

	@Test
	public void testSetAmount() {
		obj.setAmount(6000);
		assertEquals(6000, obj.getAmount(),0.0);
	}

	@Test
	public void testGetNoOfMonth() {
		assertEquals(15,obj.getNoOfMonth());
	}

	@Test
	public void testSetNoOfMonth() {
		obj.setNoOfMonth(18);
		assertEquals(18,obj.getNoOfMonth());
	}

	@Test
	public void testGetAgeOfACHolder() {
		assertEquals(24,obj.getAgeOfACHolder());
	}

	@Test
	public void testSetAgeOfACHolder() {
		obj.setAgeOfACHolder(29);
		assertEquals(29,obj.getAgeOfACHolder());
	}

}
