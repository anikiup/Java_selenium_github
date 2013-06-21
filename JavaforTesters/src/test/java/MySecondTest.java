import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MySecondTest {

	

	/**
	 * Here the class has public scope. Any class in any package can use this class.
	 *Our classes should be public for junit to access
	 */
	@Test
	public void canAddTwoPlusTwo() {
	//This method can  be called by any class that can call MySecondTest	
		//no parameters supplied ()
		
		int answer=2+2;
		//answer is the variable declared
		assertEquals("answers are matching",5,answer);
		//This will check if 4 = answer
	}
	
	
	
	

}
