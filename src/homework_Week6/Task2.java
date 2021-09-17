package homework_Week6;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {

		// 1. Write java program that can add an Integer after the last index of an integer array

		int nums[] = { 1, 2, 3 };
		int nums2[] = new int[nums.length + 1];

		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}

		nums2[nums.length] = 7;

		System.out.println(Arrays.toString(nums2));

	}
}
