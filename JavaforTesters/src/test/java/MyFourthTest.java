import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MyFourthTest {

	
	/**
	 * Here the class has public scope. Any class in any package can use this class.
	 *Our classes should be public for junit to access
	 */
	@Test
	public void canDivide() {
	//This method can  be called by any class that can call MySecondTest	
		//no parameters supplied ()
		
		int answer2=4/2;
		//answer is the variable declared
		assertEquals("answers are matching",2,answer2);
		//This will check if 4 = answer
	}
	
	
	
	

}
