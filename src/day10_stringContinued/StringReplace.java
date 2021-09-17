package day10_stringContinued;

public class StringReplace {
	public static void main(String[] args) {

		String word1 = "cat";

		String word2 = word1.replace('r', 't'); // .replace(old char,new char);

		System.out.println(word2);

		String str = "Salary of SDET is 80000";

		String str2 = str.replace("80000", "$135,000");

		System.out.println(str2);
//  You can replace a character, a word, or even a sentence

	}
}