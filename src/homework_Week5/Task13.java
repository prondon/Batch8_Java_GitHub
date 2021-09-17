package homework_Week5;

import java.util.Arrays;

public class Task13 {
	public static void main(String[] args) {

		/*
		 * Task 13: Write a Java program to find the duplicate values of an array of
		 * integer values. int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		 * 
		 * String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		 */

		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };
		int num = 0;
		for (int i = 0; i < my_array.length; i++) {
			String currentInt = Integer.toString(my_array[i]);
			if (Arrays.toString(my_array).contains(currentInt)) {
				num++;
			}
			if (num > 2) {
				System.out.println(currentInt);
			}
		}
	}
}