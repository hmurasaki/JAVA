package example03;

import java.io.File;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) throws Exception {
		
		File filePath = new File("/Users/hyejilee/eclipse-workspace/Practice_Chap25(IO기반 입출력 Part-2)/src/example03/안녕하세요.rtf");
		System.out.println(filePath.getCanonicalPath());
		
		//??Reader, ??Writer붙는 클래스들은 문자특화기반 클래스이다.
		//동영상, 사진, 오디오 등 이진 파일을 읽을 수 없음을 기억하자
		FileReader fiReader = new FileReader(filePath);
//		System.out.println("파일 크기 : " + filePath.length());
		
		int readCharNo;
		
		//char배열의 사이즈가 크면 클수록 역시 많은 데이터를 한번에 읽기 때문에 속도향상된다.	
		char[] cArr = new char[100];     //200바이트 할당
		int i = 0;
		
		while((readCharNo = fiReader.read(cArr)) != -1) {
			String str = new String(cArr, 0, readCharNo);
			System.out.print(str);
			i++;
		}
//		System.out.println();
		System.out.write(13);     //개행
		System.out.println("루핑 수 : " + i);
		
		
		fiReader.close();
		
		
		
		
		
	}

}
