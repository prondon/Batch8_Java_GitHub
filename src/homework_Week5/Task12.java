package homework_Week5;

import java.util.Arrays;

public class Task12 {
	public static void main(String[] args) {

		/*
		 * Task 12: Write a Java program to find the maximum and minimum value of an
		 * array. int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254,
		 * 1472, 2365, 1456, 2265, 1457, 2456};
		 */

		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };

		Arrays.sort(my_array1);

		System.out.println("The minimum value of my_array1: " + my_array1[0]);
		System.out.println("The maximum value of my_array1: " + my_array1[my_array1.length - 1]);

	}
}
