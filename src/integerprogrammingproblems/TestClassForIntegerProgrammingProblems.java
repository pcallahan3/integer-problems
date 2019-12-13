package integerprogrammingproblems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
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
	
	//Unit test for findElementInArray() function
	@Test
	public void findElementInArrayUnitTest() {
		IntegerProblems findElementInArrayTest = new IntegerProblems();
		int[] testArr = {23,7,83,12,98,1};
		assertEquals(7, findElementInArrayTest.findElementInArray(testArr, 7));
		
	}
	
	//Unit test for findMaxIntegerInArray() function
	@Test 
	public void findMaxIntegerInArrayUnitTest(){
		IntegerProblems findMaxIntegerInArrayTest = new IntegerProblems();
		int[] testArr = {21,12,456,122,87};
		assertEquals(456, findMaxIntegerInArrayTest.findMaxIntegerInArray(testArr));
	}
	
	//Unit test for findMinIntegerInArray() function
	@Test
	public void findMinIntegerInArrayUnitTest() {
		IntegerProblems findMinIntegerInArrayTest = new IntegerProblems();
		int[] testArr = {233,216,765,23,12,78};
		assertEquals(12, findMinIntegerInArrayTest.findMinIntegerInArray(testArr));
		
	}
	
	//Unit test for getMiddleElement() function
	@Test 
	public void getMiddleElementUnitTest() {
		IntegerProblems getMiddleElementTest = new IntegerProblems();
		int[] testArr = {6,78,23,98,67,90,45};
		assertEquals(98, getMiddleElementTest.getMiddleElement(testArr, 0, testArr.length - 1));
		
	}
	
}
