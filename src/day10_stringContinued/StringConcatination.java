package day10_stringContinued;

public class StringConcatination {
	public static void main(String[] args) {

		String word = "re";
		String word2 = "think";
		String word3 = "ing";

//		String result = word + word2 + word3;
//		System.out.println(result);

		String result = "";

//		result += word; // "" + "re";
//		System.out.println(result);
//
//		result += word2; // "re" + "think";
//		System.out.println(result);
//
//		result += word3; // "rethink" + "ing";
//		System.out.println(result);

		result = word.concat(word2).concat(word3); // "re" + "think" + "ing"; .concat(); adds one
													// String to another
		System.out.println(result);

		int len = word.concat(word2).concat(word3).length();
		System.out.println(len);

		int num = 5;

		for (int i = 1; i <= 5; i++) {

			int total = num * i;

//			System.out.println(i);
//			System.out.println(total);

//			String msg = "".concat(num)  // .concat() method does NOT work with a number, only with
			// another String

			String msg = num + " X " + i + " = " + total;
			System.out.println(msg);

		}

	}
}
