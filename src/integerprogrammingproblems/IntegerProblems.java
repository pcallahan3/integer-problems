package integerprogrammingproblems;


//A class to test integer programming problems
public class IntegerProblems {

	public static void main(String[] args) {
		
		int[] arr = {122,23,21,132,1013};
		System.out.println(findMinIntegerInArray(arr));
		
	}

	
	/* Problem statement: Sum an array of integers.
	 * Pseudocode for sumArray() function:
	 *     1. Create a function that takes one array argument to sum
	 *     2. Declare and initialize a variable sum to 0 to store the sum of the array
	 *     3. Loop over the length of the array and increment index 
	 *     4. Sum element of the array indexes
	 *     5. Return the sum of the elements
	 *     
	 * Space and time complexity of sumArray() = O(1 + 1 + 1) + O(n) = O(n)
	 *                              sumArray() = O(n) complexity
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
	 *     3. Check if key is in the array if it is return the key.
	 *     4. If key is not in the array return -1.
	 *     
	 * Space and time complexity of findElementInArray() = O(1 + 1 + 1) + O(n) = O(n)
	 *                              findElementInArray() = O(n) complexity 
	 */
	
	static int findElementInArray(int[] arr,int key) {
		for(int i = 0;i < arr.length;i++) {//O(n) linear time operation 
			if(arr[i] == key) {//O(1) constant time operation 
				return key;//O(1) constant time operation 
			}
		}
		
		return -1;//O(1) constant time operation 
	}
	
	/* Problem statement: Find the maximum integer in an array of integers.
	 * Pseudocode for findMaxIntegerInArray() function:
	 *     1. Create a function that takes in an array of integers and finds the maximum integer.
	 *     2. Declare and initialize an int named max that sets the first index of the array to max.
	 *     3. Loop over the length of the array, increment the index.
	 *     4. Check if the index is greater than the max, if it is, assign the index to max.
	 *     5. Loop until the index is less than the max and return the max.
	 *  
	 *  Space and time complexity findMaxIntegerInArray(): O(1 + 1 + 1 + 1 ) + O(n) = O(n)
	 *  						  findMaxintegerInArray() = O(n) complexity
	 * 
	 */
	 
	static int findMaxIntegerInArray(int[] arr) {
		int max = arr[0];//O(1) constant time operation
		for(int i = 0;i < arr.length;i++) {//O(n) linear time operation 
			if(arr[i] > max) {//O(1) constant time operation 
				max = arr[i];//O(1) constant time operation 
			}
		}
		return max;//O(1) constant time operation
	}
	
	/* Problem statement: Find the minimum integer of an array of integers.
	 * Pseudcode for findMinIntegerInArray() function:
	 *    1. Create a function that takes in an array of integers.
	 *    2. Declare and initialize a variable named min to the first index of the array.
	 *    3. Loop over the length of the array and increment the index.
	 *    4. Check if the index is less than min, if it is, assign the index to min.
	 *    5. Loop until the index is greater than the min and return the min.
	 *    
	 *  Space and time complexity of findMinIntegerInArray(): O(1 + 1 + 1 + 1) + O(n) = O(n)
	 *                               findMinIntegerInArray() = O(n)
	 */
	
	static int findMinIntegerInArray(int[] arr) {
		int min = arr[0];//O(1) constant time operation 
		for(int i = 0;i < arr.length;i++) {//O(n) linear time operation 
			if(arr[i] < min) {//O(1) constant time operation
				min = arr[i];//O(1) constant time operation 
			}
		}
		
		return min;//O(1) constant time operation
	}

	
}

