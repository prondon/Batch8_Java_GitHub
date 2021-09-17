package day13_arrays;

public class ArrayIntro {
	public static void main(String[] args) {

//		String[] months; // declares a one dimensional array

		// First way to create an array:
		
		String names[] = { "Erkin", "Elira", "Darima", "Dina", "Pedro" };// the placement of the square
																		 // brackets can be after the
																		 // data type or the name of
																		 // the variable
		// Second way to create an array with extra syntax:
//index                          0  1  2  3  4  5  6  7  8
		int nums[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // this line declares AND initializes
																// the array in a single line
		System.out.println(nums[0]); // 1

		System.out.println(nums[3]); // 4

		System.out.println(nums[6]); // 7

		System.out.println(names[1]); // Elira; syntax to access a piece of data in the array is
										// variable name[index position];

		String fruits[] = new String[6]; // third way to create an array; creates an empty array; only 
										 // 6 elements can be added to this array

		System.out.println(fruits[0]); // returns default value of String, null

		fruits[2] = "Apple";
		
		System.out.println(fruits[0]);  // null
		System.out.println(fruits[1]);  // null
		System.out.println(fruits[2]);  // Apple
		System.out.println(fruits[3]);  // null
		System.out.println(fruits[4]);  // null
		System.out.println(fruits[5]);  // null
		
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Orange";
		fruits[3] = "Kivi";
		fruits[4] = "Mango";
		fruits[5] = "Pear";
		
		System.out.println(fruits[0]);  
		System.out.println(fruits[1]);  
		System.out.println(fruits[2]); 
		System.out.println(fruits[3]);  
		System.out.println(fruits[4]);  
		System.out.println(fruits[5]);  
		
		fruits[3] = "Kiwis";  // you can always update the value within an array
	
		
		System.out.println(fruits[0]);  
		System.out.println(fruits[1]);  
		System.out.println(fruits[2]); 
		System.out.println(fruits[3]);  
		System.out.println(fruits[4]);  
		System.out.println(fruits[5]); 
		
		fruits[6] = "Melon";  // since arrays have a fixed size, you cannot add a value to a 
							  // non-existent position; they can only contain the same data type
			
	}
}
