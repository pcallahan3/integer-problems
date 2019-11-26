package integerprogrammingproblems;


//A class to test integer programming problems
public class IntegerProblems {

	public static void main(String[] args) {
		
		int[] arr = {1,23,2,24,3};
		System.out.println(sumArray(arr));
	}

	
	/* Problem statement: Sum an array of integers 
	 * Pseudocode for sumArray() function: 
	 *     1. Declare and initialize a variable sum to 0 to store the sum of the array
	 *     2. Loop over the length of the array and increment index 
	 *     3. Sum element of the array indexes
	 *     4. Return the sum of the elements
	 */
	
	static int sumArray(int[] arr) {
		
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
		}
		
		return sum;
	}
}