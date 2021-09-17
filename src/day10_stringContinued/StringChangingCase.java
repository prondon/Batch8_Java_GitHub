package day10_stringContinued;

public class StringChangingCase {
	public static void main(String[] args) {

		String name = "Pedro";
		String name2 = name.toUpperCase();
		String name3 = name.toLowerCase();

		System.out.println(name);
		System.out.println(name2); // PEDRO
		System.out.println(name3); // pedro

		if (name.equals(name2)) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}

		if (name.toUpperCase().equals(name2.toUpperCase())) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}

		if (name.toLowerCase().equals(name2.toLowerCase())) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}
	}
}
