package day8_loopReview;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {

		Random random = new Random(); // hover over and choose Import 'Random' (java.util)

//		System.out.println(random.nextInt(10));   here, you assign the upper limit/max, 10 in this case

//		for (int i = 0; i < 10; i++) {
//			System.out.println(random.nextInt(100));
//		}

		String areaCode = "703";

		for (int i = 1; i < 101; i++) {
			System.out.print(areaCode);
			System.out.print(random.nextInt(999));

			System.out.print(random.nextInt(9999));

			System.out.println();
			System.out.println();
		}

	}
}
