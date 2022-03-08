import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalDate yesterday= date.minusDays(1);
		LocalDate tommorrow= yesterday.plusDays(2);
		
		System.out.println(yesterday);
		System.out.println(tommorrow);
		
		LocalDate leap = LocalDate.of(2021, 12, 13);
		
		
		System.out.println(leap.isLeapYear());
		
		DayOfWeek day = leap.getDayOfWeek();
		System.out.println(day);
		
		LocalDateTime time = leap.atTime(13, 29);
		
		System.out.println(time);
	}

}
