package day17_wrapperClassAndLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		LocalDateTime now = today.atTime(9, 24);

		System.out.println(now);

		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(now1);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");

		System.out.println(now1.format(df));
		System.out.println(now1.format(tf));
		System.out.println(now1.format(dtf));

		// Find out which day were you born?

		LocalDate birth = LocalDate.of(1999, 9, 8);

		DateTimeFormatter day = DateTimeFormatter.ofPattern("EEEE");

		System.out.println(birth.format(day));

		System.out.println(today);

		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());

		System.out.println(birth.getMonthValue());
		System.out.println(birth.getDayOfMonth());

		int month1 = today.getMonthValue();
		int month2 = birth.getMonthValue();

		int day1 = today.getDayOfMonth();
		int day2 = birth.getDayOfMonth();

		if (month1 == month2 && day1 == day2) {

			System.out.println("Happy Birthday!!!!");
		
		}
		
		// Alternate solution:
		DateTimeFormatter test = DateTimeFormatter.ofPattern("MMMM/dd");
		
		if(today.format(test).equals(birth.format(test))) {
			System.out.println("Happy B-day");
		}
		
		
	}
}
