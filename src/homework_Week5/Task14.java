package homework_Week5;

//import java.util.Arrays;

public class Task14 {
	public static void main(String[] args) {

		/*
		 * Task14: UniqueIntegers 1. write a program that can print out the unique
		 * numbers from an array of integers Ex: int[] arr ={1,1,2,3,3,4} output: 2 4
		 */

		int[] arr = { 1, 1, 2, 3, 3, 4 };
//		int uniqueInt = -1;

		for (int i = 0; i < arr.length; i++) {
			int lookingFor = arr[i];
//			int num = 0;
			for (int j = 0; j < arr.length; j++) {
				int found = arr[j];
				System.out.println("Looking for <" + lookingFor + "> found < " + found + ">");
				if (lookingFor == found) {
//					num++;
				}
			}
		}
	}
}