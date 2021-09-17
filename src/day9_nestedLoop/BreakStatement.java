package day9_nestedLoop;

public class BreakStatement {
	public static void main(String[] args) {

		// the moment the code reaches break, it stops reading the statement and moves
		// on to the next one;
		// break can be used in while, do-while, and for while loops

//		for (int i = 1; i <= 10; i++) { // the code will run for 10 iterations (1, 2, 3, 4...10)
//			System.out.println(i);
//
//			if (i == 5) {
//				break; // when the if condition is true, the break code block will execute
//			}
//		}

		int count = 20;

		do {
			System.out.println(count);
			
			if (count == 14) {
				break;
			}

			count--;
		} while (count > 0);

	}
}
