package homework_Week6;

import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {

		// 2. Write java program that can add a double after the last index of a double array

		double nums[] = { 1.0, 2.0, 3.0 };
		double nums2[] = new double[nums.length + 1];

		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}

		nums2[nums.length] = 7.5;

		System.out.println(Arrays.toString(nums2));

	}
}
