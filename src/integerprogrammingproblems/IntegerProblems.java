package integerprogrammingproblems;


//A class to test integer programming problems
public class IntegerProblems {

	public static void main(String[] args) {
		
		int[] arr = {1,23,2,24,3};
		System.out.println(findElementInArray(arr, 23));
		
	}

	
	/* Problem statement: Sum an array of integers.
	 * Pseudocode for sumArray() function:
	 *     1. Create a function that takes one array argument to sum
	 *     2. Declare and initialize a variable sum to 0 to store the sum of the array
	 *     3. Loop over the length of the array and increment index 
	 *     4. Sum element of the array indexes
	 *     5. Return the sum of the elements
	 *     
	 * Space and time complexity of sumArray = O(1 + 1 + 1) + O(n) = O(n)
	 */
	static int sumArray(int[] arr) {
		int sum = 0;// O(1) constant time operation
		for(int i = 0;i < arr.length;i++) {//O(n) linear time operation 
			sum += arr[i];//O(1) constant time operation 
		}
		
		return sum;//O(1) constant time operation
	}
	
	
	/* Problem statement: Find if an element exists in an array of integers if element doesnt exist return -1.
	 * Pseudocode for findElementInArray() function: 
	 *     1. Create a function that takes in 2 arguments one which is an array to search, 2nd argument for a 
	 *        key element to find.
	 *     2. Loop over the length of the array and increment the index.
	 *     3. Check if key is in the array if it is return key.
	 *     4. If key is not in array return -1.
	 */
	
	static int findElementInArray(int[] arr,int key) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == key) {
				return key;
			}
		}
		
		return -1;
	}
}