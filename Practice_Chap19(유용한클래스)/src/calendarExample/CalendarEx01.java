package calendarExample;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		
		//기본적으로 현재 날짜와 시간으로 설정된다.(싱글톤패턴)
		Calendar today = Calendar.getInstance(); //추상클래스
//		System.out.println(today);
		
		System.out.println("올 해의 연도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11) : " + (today.get(Calendar.MONTH)+1));
		System.out.println("올 해의 몇째주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올 해의 몇일 : " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("요일(1~7), 1 : 일요일) : " + today.get(Calendar.DAY_OF_WEEK)); 
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));

		System.out.println("이 달의 마지막날 : " + today.getActualMaximum(Calendar.DATE));
	}

}
