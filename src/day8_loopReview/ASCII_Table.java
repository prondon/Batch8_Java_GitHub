package day8_loopReview;

public class ASCII_Table {
	public static void main(String[] args) {

//		int num = 65;  // 65 is stored into an integer, int num
//
//		char letter = (char) num;  // assign a number to a character
//
//		System.out.println(letter);
//
//		for (int num = 65; num <= 90; num++) {
//			char letter = (char) num;  
//			System.out.println(letter);
//		}

//		for (int num = 97; num <= 122; num++) {
//			char letter = (char) num;
//			System.out.println(letter);
//		}

		char apple = 'A';
		char orange = 'Z';

		int num = apple;
		int num2 = orange;

		System.out.println(num); // 65
		System.out.println(num2); // 90

//                   65		   90
		for (int i = num; i <= num2; i++) {
			System.out.println(i);  // prints out 65, 66, 67, 68...90

			char letter = (char) i; // hover over and choose Add cast to 'char'
			System.out.println(letter);  // prints out A, B, C, D...Z
		}

	}
}
