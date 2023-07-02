package formatExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		
		Date date = new Date();     //타임스태프 역할
		System.out.println(date.toString());
		
		SimpleDateFormat sFormat = new SimpleDateFormat("yy-MM-dd E요일 a hh:mm:ss");       //a는 오전오후표시
		System.out.println(sFormat.format(date));
		
		//요일
		sFormat = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sFormat.format(date));
		
		//연기준
		sFormat = new SimpleDateFormat("오늘은 올 해의 D번째 날");
		System.out.println(sFormat.format(date));
		
		//월기준
		sFormat = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sFormat.format(date));
		
		//타임존 ( 아시아 서울 )
		sFormat = new SimpleDateFormat("z");
		System.out.println(sFormat.format(date));
		
	}

}
