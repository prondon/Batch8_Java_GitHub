package day13_arrays;

public class ReadArrayByIndex {
	public static void main(String[] args) {

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars[0]);

		System.out.println("Cars at Element 1: " + cars[0]);
		System.out.println("Cars at Element 2: " + cars[1]);
		System.out.println("Cars at Element 3: " + cars[2]);
		System.out.println("Cars at Element 4: " + cars[3]);

		System.out.println("I like " + cars[0] + ", " + cars[2] + " and " + cars[3]);

		String[] months = new String[12]; // length of array is 12

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

//		System.out.println(months[0]);
//		System.out.println(months[1]);
//		System.out.println(months[2]);
//		System.out.println(months[3]);
//		System.out.println(months[4]);
//		System.out.println(months[5]);
//		System.out.println(months[6]);
//		System.out.println(months[7]);
//		System.out.println(months[8]);
//		System.out.println(months[9]);
//		System.out.println(months[10]);
//		System.out.println(months[11]);

//		System.out.println(months.length);  // note: there are no parenthesis () in this syntax
//		
//		for(int i = 0; i<12; i++) {
//			System.out.println(i);
//			System.out.println(months[i]);
//		}

		for (int i = 0; i < months.length; i++) {
//			System.out.println(i);
			System.out.println(months[i]);
		}

	}
}
