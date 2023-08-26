package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx02 {

	public static void main(String[] args) throws Exception {
		
		
		InputStream iStream = new FileInputStream("/Users/hyejilee/Desktop/공부/text.rtf");
		int readByteNo;
		int i = 0;
		byte[] b = new byte[2];
		
		while( (readByteNo = iStream.read(b)) != -1 ) {
			System.out.println("읽은 바이트 수 : " + readByteNo);
			//String클래스로 반드시 디코딩해야 한글이 출력된다.
			String str = new String(b);
			System.out.println("읽은 문자열 : " + str); //문자열 출력
			i++;
		}
		
		iStream.close();
		
		
		
	}

}
