package example01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamReadEx {

	public static void main(String[] args) throws Exception {
		
		//다형성이 적용된 코드, 일반 예외가 발생하는데 그 예외를 JVM에게 던지고 있다. 
		InputStream iStream = new FileInputStream("/Users/hyejilee/Desktop/공부/text.rtf");        //c드라이브에 test 텍스트 생성 "ABC가나다"
		int readByte;      //읽은 바이트 수를 리턴 받는 변수
		
		//inputStream의 read()메서드는 더이상 읽을게 없다면, -1값을 리턴한다.
		//기본적으로 이클립스는 한글을 2바이트로 읽어들임. 인코딩을 해주지않으면 깨져서 나온다.
		while( (readByte =  iStream.read()) != -1 ) {
			System.out.println("읽은 바이트 수 : "  + readByte);    //아스키코드값을 출력
			System.out.println("읽은 문자 출력 : " + (char)readByte);     //강제타입캐스팅 후 문자를 출력
		}
		System.out.println(Charset.defaultCharset());      
		
		
		//아래와 같이 작성해도 똑같은 결과를 얻을 수 있다.
//		while(true) {
//			readByte = iStream.read();
//			if(readByte == -1) {
//				break;
//			}
//			System.out.println("읽은 바이트 수 : "  + readByte);    //아스키코드값을 출력
//			System.out.println("읽은 문자 출력 : " + (char)readByte);     //강제타입캐스팅 후 문자를 출력
//		}
		
		
		
		iStream.close();    //리소스를 닫음
		
		
	}

}
