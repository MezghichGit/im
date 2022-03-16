package formationOCA.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDate ld =LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate ld2 = LocalDate.of(1986, 2, 26);
		System.out.println(ld2);
		
		//ld2 =
	    /*
		ld2.plusYears(2);
		System.out.println(ld2);
		String ch = "oca";
		ch.concat("-ocp");
		System.out.println(ch);
		StringBuilder sb = new StringBuilder("oca");
		sb.append("-ocp");
		System.out.println(sb);*/
		
		String ch = "OCA";
		ch.concat("-ocp");
		System.out.println(ch);
	}

}
