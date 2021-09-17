package day14_arrayContinue;

import java.util.Arrays;

public class MultidimentionalArray {
	public static void main(String[] args) {

//index                0  1  2  3  4
		int nums[] = { 1, 2, 3, 4, 5 };
//                      0  1  2  3
		int nums2[] = { 6, 7, 8, 9 };
//                      0   1   2   3   4
		int nums3[] = { 10, 11, 12, 13, 14 };
//                          0     1      2
		int numbers[][] = { nums, nums2, nums3 }; // [][] indicates a two dimensional array; one
													// dimensional only allows you to store a single
													// column or row; two dimensional array allows you
													// to store a table of data; an array of arrays

		System.out.println(numbers.length); // 3 elements/3 arrays

		System.out.println(numbers[0][2]); // will return 3, the element at position 2 in the array at
											// position 0

		System.out.println(numbers[2][2]); // 12

		System.out.println(numbers[1][3]); // 9

		for (int i = 0; i < numbers.length; i++) { // outer loop refers to the array index position
			System.out.println((Arrays.toString(numbers[i])));

			for (int j = 0; j < numbers[i].length; j++) { // inner loops refers to the elements within
															// each array
				System.out.println(numbers[i][j]);  // returns the value of each element within
													// each array

				if (numbers[i][j] % 2 == 0) {    
					System.out.println(numbers[i][j]);  // returns even numbers from each array
				}
			}
		}
	}
}
