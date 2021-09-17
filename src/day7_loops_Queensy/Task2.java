package day7_loops_Queensy;

public class Task2 {
	public static void main(String[] args) {

		// Write a program to calculate the sum of 1 to 100.
		
		int x;
		int sum = 0;

		for (x = 1; x <= 100; x++) {
			sum = sum + x; // updated/new sum = old/previous sum + x
			   			   // 0 + 1; 1 + 2; 3 + 3; 6 + 4; 10 + 5...4950 + 100 
		}
		System.out.println(sum);
	}
}
