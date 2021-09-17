package day11_stringTasks;

public class SubStringTask {
	public static void main(String[] args) {
//                      0123456789
		String email = "irfan.tursun@techcirclesolutions.org";
//              		 0123456789
//		String email2 = "test@gmail.com";

		// Extract username and domain name from email

		String userName = email.substring(email.indexOf('i'), email.indexOf('n', 9) + 1);
		String domainName = email.substring(email.indexOf('t', 9), email.indexOf('s', 25) + 1);

		System.out.println(userName);
		System.out.println(domainName);

		// Irfan's Solutions:

		// Username

		String userName2 = email.substring(0, email.indexOf('@'));
		System.out.println(userName2);

		// Domain name
		int startIndex = email.indexOf('@') + 1;
		int endingIndex = email.lastIndexOf('.');  // the use of .lastIndexOf();

		String domainName2 = email.substring(startIndex, endingIndex);
		System.out.println(domainName2);

		// Task with own email

		String myEmail = "pedro@email.com";

		String userName3 = myEmail.substring(0, myEmail.indexOf('@'));
		String domainName3 = myEmail.substring(myEmail.indexOf('@') + 1, myEmail.lastIndexOf('.'));

		System.out.println(userName3);
		System.out.println(domainName3);
	}
}
