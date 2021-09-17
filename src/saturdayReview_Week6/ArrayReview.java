package saturdayReview_Week6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 4 };
		int[] y = { 7, 5, 8, 6 };

		Arrays.sort(y);
		System.out.println(Arrays.toString(y));

		System.out.println(Arrays.equals(x, y));

		int[] a = { 1, 8, 3, 7 };
		int lengthOfA = a.length;
		System.out.println(lengthOfA);

		int[] b = new int[lengthOfA];
		int[] b2 = new int[a.length];

		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(b2));

		b = a.clone(); // .close() method makes a copy with DIFFERENT memory locations

		b = a; // this point to the SAME memory location; whatever happens to b will happen to
				// a and
				// vice versa

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		for (int i = 0; i < cars.length; i++) { // for loops are useful when the exact order of the
												// array elements is of importance
			System.out.println(cars[i]);
		}

		// Task:
		// We have an int array
		// If the element is odd,, add 3. If it's even, don't do anything

		int[] myArray = { 1, 2, 4, 13, 5, 8, 41, 20 };

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] % 2 == 1) {
				myArray[i] += 3;
			}
		}
		System.out.println(Arrays.toString(myArray));

		int[] myArray2 = { 1, 2, 4, 13, 5, 8, 41, 20 };

		for (int num : myArray2) { // this will NOT manipulate the original array

			if (num % 2 == 1) {
				num += 3;
				System.out.print(num + ", ");
			} else {
				System.out.print(num + ", ");
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(myArray2)); // array remains unchanged

		// Task:
		// Create a 4 X 4 int 2D array, if it's odd increment 3, if even do nothing

//	    My incomplete solution:		

//		Scanner scan = new Scanner(System.in);

//		System.out.println("Please enter your first number for Array 1: ");
//
//		int input = scan.nextInt();
//
//		System.out.println("Please enter a second number for Array 1: ");
//
//		int input2 = scan.nextInt();
//
//		System.out.println("Please enter a third number for Array 1: ");
//
//		int input3 = scan.nextInt();
//
//		System.out.println("Please enter a fourth number for Array 1: ");
//
//		int input4 = scan.nextInt();
//
//		int array1[] = new int[4];
//
//		array1[0] = input;
//		array1[1] = input2;
//		array1[2] = input3;
//		array1[3] = input4;
//
//		System.out.println("Please enter your first number for Array 2: ");
//
//		int input5 = scan.nextInt();
//
//		System.out.println("Please enter a second number for Array 2: ");
//
//		int input6 = scan.nextInt();
//
//		System.out.println("Please enter a third number for Array 2: ");
//
//		int input7 = scan.nextInt();
//
//		System.out.println("Please enter a fourth number for Array 2: ");
//
//		int input8 = scan.nextInt();
//
//		int array2[] = new int[4];
//
//		array2[0] = input5;
//		array2[1] = input6;
//		array2[2] = input7;
//		array2[3] = input8;
//
//		System.out.println(Arrays.toString(array1));
//		System.out.println(Arrays.toString(array2));

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter 16 numbers:"); // print statement

		int[][] theArray = new int[4][4]; // declare a 4x4 two dimensional array

		for (int i = 0; i < theArray.length; i++) { // refers to number of rows/arrays
			for (int j = 0; j < theArray[i].length; j++) { // refers to number of elements in each
															// row/array
				theArray[i][j] = scan.nextInt(); // sets the user entered numbers into the 2D array

			}
		}

		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[i].length; j++) {
				if (theArray[i][j] % 2 == 1) {
					theArray[i][j] += 3;
				}
			}
		}

// Index				  0             1              2             3		
// 		theArray = {{4, 2, 6, 4}, {8, 6, 10, 8}, {4, 2, 6, 4}, {8, 6, 10, 8}}  a 2D array containing
//      																	   four one dimensional 
//																			   arrays
		
		for (int[] anArray : theArray) {
			System.out.println(Arrays.toString(anArray));
		}
		scan.close();
	}

}
