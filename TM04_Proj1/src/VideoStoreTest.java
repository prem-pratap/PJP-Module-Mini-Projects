import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VideoStoreTest {
	private VideoStore obj;
	private String name;
	private Video lastadded;
	private int storesize;
	
	
	@Before
	public void setUp() throws Exception {
		obj=new VideoStore();
		name="Infinity War";
		
	}

	
	@Test
	public void testAddVideo() {
		obj.addVideo(name);
		storesize=obj.getCount();
		lastadded=obj.getLastAdded();
		assertEquals(1,storesize);
		assertEquals(name,lastadded.getName());
		
	}

	@Test
	public void testDoCheckout() {
		obj.addVideo(name);
		obj.getLastAdded().doCheckout();
		assertTrue(obj.getLastAdded().getCheckout());
	}

	@Test
	public void testDoReturn() {
		obj.addVideo(name);
		obj.getLastAdded().doReturn();
		assertFalse(obj.getLastAdded().getCheckout());
	}

	@Test
	public void testReceiveRating() {
		obj.addVideo(name);
		obj.receiveRating(name, 5);
		lastadded=obj.getLastAdded();
		assertEquals(5,lastadded.getRating());
		
	}


}
