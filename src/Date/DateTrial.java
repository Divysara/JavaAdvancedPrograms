package Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate date= LocalDate.now();
		System.out.println("Today's date: " + date);
		Month month = date.getMonth();
		System.out.println("The month is: "+month);
		LocalDate yesterday= date.minusDays(1);
		LocalDate tommorrow= yesterday.plusDays(2);
		
		System.out.println(yesterday);
		System.out.println(tommorrow);
		
		LocalDate leap = LocalDate.of(2021, 12, 13);
		
		
		System.out.println("is it a leap year ?"+ leap.isLeapYear());
		
		DayOfWeek day = leap.getDayOfWeek();
		System.out.println("The day of the wk: " +day);
		
		LocalDateTime time = leap.atTime(13, 29);
		
		System.out.println("The current time:" +time);
		
		
	}

}
