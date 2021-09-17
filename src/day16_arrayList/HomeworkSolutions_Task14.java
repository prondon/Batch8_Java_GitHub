package day16_arrayList;

public class HomeworkSolutions_Task14 {
	public static void main(String[] args) {

		/*
		 * Taks14: UniqueIntegers 
		 * Write a program that can print out the unique numbers from an array of integers 
		 * Ex: int[] arr ={1,1,2,3,3,4} output: 2 4
		 */

		// Nadia's solution
		
		int[] arr = { 1, 1, 2, 3, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					count++;// to count how many times the value appears in the array
				}
			}
			if (count == 1) {
				System.out.print(arr[i] + " ");				
			}
		}
	}
}
