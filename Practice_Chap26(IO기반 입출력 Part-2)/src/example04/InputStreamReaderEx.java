package example04;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {

	public static void main(String[] args) throws Exception {
		
		//주 입력 스트림을 바이트 기반인 InputStream으로 설정한다.
		InputStream iStream = System.in;     //콘솔로부터 입력 받는다.
		
		//문잘ㄹ 받기위해 보조스트림을 주 입력스트림에 연결한다.
		Reader reader = new InputStreamReader(iStream);    
		
		int readCount;
		char[] cArr = new char[100];
		System.out.println("문자열을 입력하세요.");
		
		//콘솔에서 입력을 받을때는 -1을 리턴하는 경우는 컨트롤+z를 누르면 된다.
		//콘솔창의 실행,중지창을 자세히 살펴보도록 합시다.
		while((readCount = reader.read(cArr)) != -1) {
			String str = new String(cArr, 0, readCount);      //String으로 생성
			System.out.println("키보드로부터 읽은 문자열 : " + str);
		}
		
		
		
		
		
		
		
		
		
		
		reader.close();
		iStream.close();
		
		
		
		
		
	}

}
