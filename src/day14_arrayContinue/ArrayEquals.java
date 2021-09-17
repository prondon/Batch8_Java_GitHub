package day14_arrayContinue;

import java.util.Arrays;

public class ArrayEquals {
	public static void main(String[] args) {

		int intArr[] = { 10, 20, 15, 22, 35 };

		int intArr1[] = { 10, 15, 22 };

		System.out.println("Integer Arrays on comparison: " + Arrays.equals(intArr, intArr1)); // false

		int nums[] = { 5, 4, 3, 2, 1 };

		int nums2[] = { 1, 2, 3, 4, 5 };

		int nums3[] = { 2, 3, 4, 5 };
		
		System.out.println(Arrays.equals((nums), nums2));  // false
		
		System.out.println(Arrays.equals(nums, nums3));  // false
		
		Arrays.sort(nums);  // this method performs a task on the elements but does not return a value
		System.out.println(Arrays.equals(nums, nums2));  // true
		
		Arrays.sort(nums3);
		System.out.println(Arrays.equals(nums2, nums3));  // these two arrays havve different lengths

	}
}
