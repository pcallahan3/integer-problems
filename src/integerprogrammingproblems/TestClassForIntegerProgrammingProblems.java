package integerprogrammingproblems;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


//A class to test IntegerProblems class
public class TestClassForIntegerProgrammingProblems {
	
	
	
	@Test
	public void sumArrayUnitTest() {
		IntegerProblems sumArrayTest = new IntegerProblems();
		int[] testArr = {1,2,3};
		assertEquals(6, sumArrayTest.sumArray(testArr));
		
	}
	
	

}
