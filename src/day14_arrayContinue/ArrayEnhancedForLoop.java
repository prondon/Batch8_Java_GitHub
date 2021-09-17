package day14_arrayContinue;

public class ArrayEnhancedForLoop {
	public static void main(String[] args) {

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		for (String i : cars) {
			System.out.println(i);
		}

		int nums[] = { 10, 20, 30, 40, 50 };

		// for loop will access each element by index

		// For Each Loop is unique to arrays:

		for (int pedro : nums) { // note colon (:), NOT semicolon (;); syntax is for(data type unique
			// collection name : array variable name){}
			System.out.println(pedro);
		}
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

		for (String mo : months) {
			System.out.println(mo);
		}

	}
}
