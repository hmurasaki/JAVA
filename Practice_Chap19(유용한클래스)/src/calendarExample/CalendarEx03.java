package calendarExample;

import java.util.Calendar;

public class CalendarEx03 {

	public static void main(String[] args) {
		
		//기본적으로 현재 날짜와 시간으로 설정된다.(싱글톤패턴)
		Calendar today1 = Calendar.getInstance(); //추상클래스
		Calendar today2 = Calendar.getInstance();
		
//		System.out.println(today);
		
		//임의로 날짜를 설정       이코드로 시차구하기 해보자
		today1.set(2015, 7, 15);
		
		long diff = (today2.getTimeInMillis() - today1.getTimeInMillis())/1000;
		//1일 = 24시간 * 60 * 60 
		long diffDay = diff/(24*60*60);
		System.out.println("20150715~20230702사이 지난 초 : " + diff);
		System.out.println("20150715~20230702사이 지난 일수 : " + diffDay);
		
		
		
	}

}
