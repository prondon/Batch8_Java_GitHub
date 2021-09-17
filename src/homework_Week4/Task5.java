package homework_Week4;

public class Task5 {
	public static void main(String[] args) {

//  Write a method which prints out the numbers from 1 to 100 but
//	for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
//	for numbers which are a multiple of 3, print "FIN" instead of the number and
//	for numbers which are a multiple of 5, print "RA" instead of the number.
//	    ex:
//	        output:
//	            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....

//		String str1 = "FIN";
//		String str2 = "RA";
//
//		String msg = "";
//
//		for (int i = 1; i <= 100; i++) {
//
//			if (i % 3 == 0) {
//				msg = str1;
//			}
//			if (i % 5 == 0) {
//				msg += str2;
//
//			}
//			if (msg.length() == 0) {
//				System.out.print(i + " ");
//			} else {
//				System.out.print(msg + " ");
//			}
//			msg = "";
//		}

		// Irfan's Solution

		String msg2 = "";

		for (int i = 1; i < 101; i++) {

			if (i % 3 == 0) {
				msg2 = "FIN";
			}

			if (i % 5 == 0) {
				msg2 = "RA";

			}

			if (i % 3 == 0 && i % 5 == 0) {
				msg2 = "FINRA";

			}

			if (msg2.isEmpty()) {
				System.out.print(i + " ");
			} else {
				System.out.print(msg2 + " ");
			}
			msg2 = "";
		}
	}
}
