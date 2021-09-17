package day14_arrayContinue;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {

		int[] nums = new int[] { 5, 3, 1, 2, 4 }; // declare AND initialize

		System.out.println(nums[2]); // 1; returns value at position 2/third position in array
		System.out.println(nums.length); // 5; returns the size/number of elements in the array
		System.out.println(nums[4]); // 4
		System.out.println(nums[nums.length - 1]); // 4; dynamic way to find that value at the final
													// position of the array

		for (int i = 0; i <= nums.length - 1; i++) {
			System.out.print(nums[i]);  // 53124
		}
		System.out.println();

		System.out.println(Arrays.toString(nums)); // returns original array BEFORE sorting;
													// .toString() converts your array to a String on
													// one line

		Arrays.sort(nums);  // .sort(); method will arrange the numbers from smallest to largest

		System.out.println(Arrays.toString(nums)); // returns sorted array

		String names[] = { "C", "D", "A", "B" };

		System.out.println(Arrays.toString(names));

		Arrays.sort(names);  // . sort(); method will arrange Strings in alphabetical order

		System.out.println(Arrays.toString(names));
	}
}
