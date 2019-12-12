package integerprogrammingproblems;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


//A class to test IntegerProblems class
public class TestClassForIntegerProgrammingProblems {
	
	//Unit test for sumArray() function 
	@Test
	public void sumArrayUnitTest() {
		IntegerProblems sumArrayTest = new IntegerProblems();
		int[] testArr = {1,2,3};
		assertEquals(6, sumArrayTest.sumArray(testArr));
		
	}
	
	//Unit test for findElementInArray
	@Test
	public void findElementInArrayUnitTest() {
		IntegerProblems findElementInArrayTest = new IntegerProblems();
		int[] testArr = {23,7,83,12,98,1};
		assertEquals(7, findElementInArrayTest.findElementInArray(testArr, 7));
		
	}
	
	

}