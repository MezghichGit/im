package formationOCA.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class API1DateTime {

	public static void main(String[] args) {
		//1-Creating
		/*
		LocalDate ld = LocalDate.of(2022, Month.MARCH, 17);
		System.out.println(ld);
		
		//2-Manipulating
		Period p = Period.of(2, 3, 6);
		//ld.plusDays(2);
		ld = ld.plus(p);
		System.out.println(ld);
		LocalDate d1 = LocalDate.of(1985, 7, 10);
		LocalDate d2 = LocalDate.of(2022, 3, 17);
		Period period = Period.between(LocalDate.now(), d1);
		System.out.println(period);
		
		LocalDateTime ldt =LocalDateTime.now();
		System.out.println(ldt);*/
		
		LocalDate ld = LocalDate.of(2022, 2, 1);
		LocalTime lt = LocalTime.of(10, 15);
		LocalDateTime ldt = LocalDateTime.of(ld,lt);
		System.out.println(ldt);
		//3-Formatting
		/*
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ld.format(f1));
		System.out.println(ld.format(f2));
		System.out.println(f3.format(ld));
		System.out.println(f4.format(ld));*/

	}

}
