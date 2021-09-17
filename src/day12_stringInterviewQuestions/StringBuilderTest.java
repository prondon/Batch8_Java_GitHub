package day12_stringInterviewQuestions;

public class StringBuilderTest {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder(); // create the StringBuilder object once

		sb.append("ABCD"); // append is like concatenation; you can append any primitive data type to
							// your Stringbuilder object

		sb.append(true);

		sb.append('c');

		sb.append(9.1);

		sb.append(5);

		sb.reverse(); // the reverse method will reverse the StringBuilder object

		sb.charAt(0);

		System.out.println(sb);

	}
}
