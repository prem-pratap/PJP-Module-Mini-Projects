package project2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SBAccountTest {
	private SBAccount obj;
	
	@Before
	public void setUp() throws Exception {
		obj=new SBAccount();
		obj.setAmount(20000);
	}

	@Test
	public void testCalculateInterest() {
		assertEquals(800.0,obj.calculateInterest(),0.0);
	}

	@Test
	public void testGetSetInterestRate() {
		obj.setInterestRate(5);
		assertEquals(5,obj.getInterestRate(),0.0);
	}

	

	@Test
	public void testSetAmount() {
		obj.setAmount(10000);
		double d = 10000.0;
		assertEquals(d,obj.getAmount(),0.0);
	}
	
	@Test
	public void testGetAmount() {
		assertEquals(20000,obj.getAmount(),0.0);
	}

	

}
