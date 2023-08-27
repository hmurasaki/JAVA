package example01;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception{
		
		// \기호는 이스케이프문자이기 때문에 아래와 같이 \\하던지 아니면 /하나로 표식을 해도 무방하다.
		File file = new File("/Users/hyejilee/eclipse-workspace/Practice_Chap25(IO기반 입출력 Part-2)/src/example01/FileInputStreamEx.java");
		System.out.println("파일의 경로 : " + file.getPath());
		System.out.println("부모 디렉토리 : " + file.getParent());
		System.out.println("파일 실행 가능여부 : " + file.canExecute());
		System.out.println("파일 읽기 가능여부 : " + file.canRead());
		System.out.println("파일 숨김파일 여부 : " + file.isHidden());
		System.out.println("파일 쓰기나 수정 가능여부 : " + file.canWrite());
		System.out.println("파일 이름 : " + file.getName());
		System.out.println("파일 크기 : " + file.length());
		System.out.println("URI출력 형태 : " + file.toURI());
		System.out.println("URL출력 형태 : " + file.toURL());     //toURL()는 사용금지되었다.
		
		//생성자의 매개변수로 File객체를 받고 있다.
		FileInputStream fis = new FileInputStream(file);
//		FileInputStream fis = new FileInputStream("/Users/hyejilee/eclipse-workspace/Practice_Chap25(IO기반 입출력 Part-2)/src/example01/FileInputStreamEx.java");
		
		int data;
		int i = 0;
		byte[] bArr = new byte[1000];
		//한 바이트씩 읽기
		while( (data = fis.read(bArr)) != -1) {
//			System.out.print((char)data); //한글이 깨진다 .    
			System.out.write(bArr);       //콘솔출력 (원래 system.out.println()해도 무방하지만 한바이트씩 읽다보니 한글이 깨지는 경우가 있기때문에 writw를써도 괜찮다. 동일한 출력스트림이다.
			i++;
		}
		System.out.println("루핑 수 : " + i);
		fis.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
