import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VideoTest {
	private Video obj;
	private String videoname;
	private int rate;
	@Before
	public void setUp() throws Exception {
		videoname="Testing Video Name";
		obj=new Video(videoname);
	}

	
	@Test
	public void testGetName() {
		assertEquals(videoname, obj.getName());
	}

	@Test
	public void testDoCheckout() {
		obj.doCheckout();
		assertTrue(obj.getCheckout());
	}

	@Test
	public void testDoReturn() {
		obj.doReturn();
		assertFalse(obj.getCheckout());
	}

	@Test
	public void testReceiveRating() {
		obj.receiveRating(rate);
	}

	@Test
	public void testGetRating() {
		obj.receiveRating(rate);
		assertEquals(rate, obj.getRating());
	}

	@Test
	public void testGetCheckout() {
		obj.doCheckout();
		assertTrue(obj.getCheckout());
		obj.doReturn();
		assertFalse(obj.getCheckout());
	}

}
