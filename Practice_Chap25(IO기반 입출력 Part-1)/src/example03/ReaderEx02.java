package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx02 {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("/Users/hyejilee/Desktop/공부/text.rtf");
		int readData;
		char[] cArr = new char[2];
		String str = "";
//		StringBuilder sBuilder = new StringBuilder();
		
		//read()매개변수가 char[]타입이란 것에 주목을 반드시 하자.
		while((readData = reader.read(cArr)) != -1) {     //char버퍼사용
			str += new String(cArr, 0, readData); //복합대입연산 사용
//			sBuilder.append(cArr);
			System.out.println("읽은 문자 수 : " + readData);
		}
		//문자열 출력
		System.out.println(str);
//		System.out.println(sBuilder);
		
		
		
		reader.close();
		
	}

}
