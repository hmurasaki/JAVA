package example04;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {

	public static void main(String[] args) throws Exception {
		//주 입력스트림을 바이트 기반인 InputStream으로 설정한다.	
		InputStream iStream = System.in;       //키보드(콘솔)로부터 입력을받음.
		
		//문자를 받기위해서 보조 스트림을 주입력 스트림에 연결한다.
		Reader reader = new InputStreamReader(iStream);     
		
		int readCount;
		char[] cArr = new char[100];
		System.out.print("문자열을 입력하세요.");
		
		//콘솔에서 입력을 받을 때는 -1을 리턴하는 경우는 컨트롤+z를 누르면 -1이된다.
		//콘솔창의 실행, 중지창을 자세히 살펴보자.
		while((readCount = reader.read(cArr)) != -1) {
			//디코딩을 스트링으로 바꾸기
			String str = new String(cArr, 0, readCount);  //스트링으로 생성
			System.out.println("키보드로 부터 읽은 문자열 : " + str);
		}
		
		
		
		
		reader.close();
		iStream.close();
		
		
		
	}

}
