package day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListAddAll {
	public static void main(String[] args) {

		ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

		Iterator<Integer> iter = nums2.iterator();

		System.out.println("Before: " + nums1);

		while (iter.hasNext()) {
//			System.out.println(iter.next());
			nums1.add(iter.next());
		}
		System.out.println("After: " + nums1);
		
		ArrayList<Integer> nums3 = new ArrayList<>();  // creates an empty ArrayList
		
		System.out.println(nums3);  // []
		
		nums3.addAll(nums1);  // .addAll(); method is used to combine two ArrayLists
		nums3.addAll(nums2);
		
		System.out.println(nums3);
		
		nums3.addAll(1, nums2);  // .addAll(index position, ArrayList variable name); method adds the 
								 // second ArrayList at a specific position
		
		System.out.println(nums3);
		
	}
}
