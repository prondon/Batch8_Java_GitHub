package saturdayReview_Week4;

public class Task3 {
	public static void main(String[] args) {

		// print:
		// ****
		// ***
		// **
		// *
		
		for (int i = 4; i >= 1; i--) {  // outter loop
			for (int k = i; k >= 1; k--) {  // inner loop
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
