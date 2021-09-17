package homework_Week5;

public class Task11 {
	public static void main(String[] args) {

		/*
		 * Task 11:
		 * 
		 * Write a Java program to test if an array contains a certain value int[]
		 * my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365,
		 * 1456, 2265, 1457, 2456}; Check if 2019 , 2013 contains above array.
		 */

		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };
		int lookingFor1 = 2019;
		int lookingFor2 = 2013;

		for (int i = 0; i < my_array1.length; i++) {
			if (my_array1[i] == lookingFor1) {
				System.out.println("my_array1 contains " + lookingFor1);
			}
			if (my_array1[i] == lookingFor2) {
				System.out.println("my_array1 contains " + lookingFor2);
			}
		}

		// Irfan's solution:

		int targetNumber = 2013;
		int targetNumber2 = 2019;
		boolean flag = false;

		for (int pedro : my_array1) {
			if (pedro == targetNumber) {
				System.out.println("I found " + pedro);
			}
			if (pedro == targetNumber2) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("I found " + targetNumber2);
		} else {
			System.out.println(targetNumber2 + " is not there");
		}

	}
}
