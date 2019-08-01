package api.datecalendar;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Date 클래스로 날짜 출력
		System.out.println(new Date(2019 - 1900, 8, 1));
		
		// Calendar 클래스 getInstance()로 오늘 날짜 출력
		// month는 0 ~ 11사이의 값을 갖기 때문에 현재 달을 구하기 위해서는 현재달 + 1을 해야함
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(calendar.YEAR) + "년" + calendar.get(calendar.MONTH) + "월" +
						   calendar.get(calendar.DAY_OF_MONTH) + "일");
		
		// 날짜를 지정하여 출력
		calendar.set(2019, 8, 1);
		System.out.println(calendar.get(calendar.YEAR) + "년" + calendar.get(calendar.MONTH) + "월" +
						   calendar.get(calendar.DAY_OF_MONTH) + "일");
	}

}
