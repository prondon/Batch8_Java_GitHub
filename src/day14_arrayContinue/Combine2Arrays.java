package day14_arrayContinue;

import java.util.Arrays;

public class Combine2Arrays {
	public static void main(String[] args) {

		// Write a program to combine below 2 arrays

		int nums1[] = { 1, 2, 3, 4, 5 };
		int nums2[] = { 6, 7, 8, 9, 10 };

		int nums3[] = new int[nums1.length + nums2.length];

		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = nums1[i];
		}
//		for (int i = nums3.length-1; i >= nums1.length; i--) {
//			nums3[i] = nums2[i-nums1.length];
//
//		}

		for (int i = nums1.length; i < nums3.length; i++) {
			nums3[i] = nums2[i - nums1.length];
		}
		System.out.println(Arrays.toString(nums3));

//		Irfan's solution:
//		
//		nums3[0] = nums1[0];
//		nums3[1] = nums1[1];
//		nums3[2] = nums1[2];
//		nums3[3] = nums1[3];
//		nums3[4] = nums1[4];
//		
//		nums3[5] = nums2[0];
//		nums3[6] = nums2[1];
//		nums3[7] = nums2[2];
//		nums3[8] = nums2[3];
//		nums3[9] = nums2[4];

		int position = 0;

		for (int i = 0; i < nums1.length; i++) {
			nums3[position] = nums1[i];
			position++;
		}
		for (int i = 0; i < nums2.length; i++) {
			nums3[position] = nums2[i];
			position++;
		}
	}
}
