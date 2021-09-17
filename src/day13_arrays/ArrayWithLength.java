package day13_arrays;

public class ArrayWithLength {
	public static void main(String[] args) {

		int[] scores = new int[5];

		scores[0] = 1;
		scores[1] = 2;
		scores[2] = 3;
		scores[3] = 4;
		scores[4] = 5;

//index   		       	  0  1  2  3  4	
		int[] scores2 = { 1, 2, 3, 4, 5 };
		scores2[3] = scores2[0] + scores2[4]; // updates the value of position 3 in the array based on
												// the equation
		System.out.println(scores2[3]); // 6

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
		
		System.out.println(months[0]);
		System.out.println(months[1]);
		System.out.println(months[2]);
		System.out.println(months[3]);
		System.out.println(months[4]);
		System.out.println(months[5]);
		System.out.println(months[6]);
		System.out.println(months[7]);
		System.out.println(months[8]);
		System.out.println(months[9]);
		System.out.println(months[10]);
		System.out.println(months[11]);

	}
}
