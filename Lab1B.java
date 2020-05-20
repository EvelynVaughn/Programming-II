/*Evelyn Vaughn 
 * 1/17/2020
 * Module 1
 * Lab1B
*/
import java.util.Arrays;
import java.util.Random; 

public class Lab1B {
	public static void main(String[] args) {
		
		int [] nums  = {1, 4, 13, 43, -25, 17, 22, -37, 29}; 
		
		System.out.println(findLargest(nums));
		
		int [] data = new int [20]; 
		fillArray(data);
		System.out.println(findLargest(data));
		
		System.out.println(findLargest(data) + findLargest(nums)); 
		
		System.out.println(Arrays.toString(data)); 
	}
	
	private static int findLargest(int[] nums) { 
		int largest = nums[0];  
			
		for (int i = 0; i < nums.length; i++) {
	 
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}
	
		return largest;		
	}
	
	private static void fillArray (int[] data) { 
		Random randValues = new Random(); 
		int values = 0;
		
		for (int i = 0; i < data.length; i++) {
			values = randValues.nextInt(201) - 100;
			data[i] = values;	
				
		}
	}
}
