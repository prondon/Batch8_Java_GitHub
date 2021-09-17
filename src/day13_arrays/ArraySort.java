package day13_arrays;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {

		int[] nums = { 5, 2, 3, 1, 4, 8 };

		for (int i = 0; i <= nums.length - 1; i++) { // before sorting
			System.out.println(nums[i]);
		}

		Arrays.sort(nums); // arrays have a .sort() method; note that Array is written with a capital
							// A

		System.out.println();

		for (int i = 0; i <= nums.length - 1; i++) { // after sorting
			System.out.println(nums[i]);
		}

		System.out.println("=====================");

		String[] months = new String[12];

		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";

		Arrays.sort(months); // this sorts your array into alphabetical order

		for (int i = 0; i < months.length; i++) { // after sorting
			System.out.println(months[i]);
		}
	}
}
