package day9_nestedLoop;

public class NestedLoop {
	public static void main(String[] args) {

//		for (int num = 1; num <= 5; num++) { // outer loop runs 5 times
////			System.out.println(num);
//
//			System.out.println("Iteration " + num);
//
//			for (int num2 = 1; num2 <= 5; num2++) { // inner loop runs 5 times during each one of the
//											        // outer loops' iterations and prints a statement
//				System.out.println(num2);
//			}
//
//		}

		// Print this pattern:
		// 1 2 3
		// 1 2 3
		// 1 2 3

		for (int i = 1; i <= 3; i++) {  // outer loop runs 3 times

			for (int j = 1; j <= 3; j++) {  // inner loop runs 3 times during each of the other loops'
				                            // iterations and prints a statement
				System.out.print(j + " ");

			}
			System.out.println(); // go to next line after each of the iterations
		}

	}

}
