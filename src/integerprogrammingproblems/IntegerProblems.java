package integerprogrammingproblems;


//A class to test integer programming problems
public class IntegerProblems {

	public static void main(String[] args) {
		
	 
		
        int[] arr = { 2, 3, 4, 10, 40, 45, 12, 23, 1,12,13,14,12}; 
        //getMiddleElement(arr, 0, arr.length - 1);
       //System.out.println(sumArray(arr));
        whileLoop(arr);
		
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
	 * Pseudocode for findMinIntegerInArray() function:
	 *    1. Create a function that takes in an array of integers.
	 *    2. Declare a variable named min and 
	 *    initialize to the first index of the array.
	 *    3. Loop over the length of the array and increment the index.
	 *    4. Check if the index is less than min, if it is, assign the index to min.
	 *    5. Loop until the index is greater than the min and return the min.
	 *    
	 *  Space and time complexity of findMinIntegerInArray(): O(1 + 1 + 1 + 1) + O(n) = O(n)
	 *                               findMinIntegerInArray() = O(n) complexity 
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
	

	 /* Problem statement: Find the middle element of an array and print the element and index where element is
	  *                    located at.
	  * Pseudocode for getMiddleElement() function:
	  *   1. Create a void function that takes in 3 arguments, an array, the first index, and the last index.
	  *   2. Declare a variable named middleElement and initialize to the first index + the last index / by 2.
	  *   3. Print the middle index of the array and the element at the index.
	  * 
	  *  Space and time complexity analysis of getMiddleElement(): O(1 + 1) = O(1)
	  *                                        getMiddleElement() = O(1) complexity 
	  */                                       
	
	static void getMiddleElement(int[] arr,int firstIndex,int lastIndex) {
		int middleElement = (firstIndex + lastIndex) / 2;//O(1) time complexity 
		System.out.println("The middle element is: " + middleElement + " and the element at the middle index is:" + arr[middleElement]);//O(1) time complexity
		
	}
	
	/* Problem statement: Print the elements of an array using a while loop.
	 * Psuedocode for printElementsUsingWhileLoop():
	 *   1. Create a function that takes in an array of integers.
	 *   2. Declare and initialize a variable named counter to 0,
	 *   3. Declare and initialize a variable named length to the length of the array.
	 *   4. While the counter is less than the array length print the index of the array and increment the counter.
	 *   5. Return the the elements of the array.
	 *    
	 * 
	 */
	
	
}

