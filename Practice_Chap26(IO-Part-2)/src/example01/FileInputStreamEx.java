package example01;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception {
		
		//'\'이스케이프는 두개를 해줘야한다. 또는 '/'하나로 표식을해도 무방하다.
		File file = new File("/Users/hyejilee/eclipse-workspace/Practice_Chap26(IO기반 입출력 Part-2)");
		System.out.println("파일의 경로 : " + file.getPath());     //파일의 경로를 얻기
		System.out.println("부모 디렉토리 : " + file.getParent()); //부모디렉터리 얻기
		System.out.println("실행 가능한가 : " + file.canExecute()); //실행가능한지 얻기  
		System.out.println("읽기 가능한가 : " + file.canRead());    //읽기가능한지
		System.out.println("숨김 파일인가 : " + file.isHidden());   //숨김파일인지
		System.out.println("쓰기나 수정이 가능한가 : " + file.canWrite());  //쓰기나 수정이 가능한지
		System.out.println("파일 이름 : " + file.getName());
		System.out.println("파일 크기 : " + file.length());
		System.out.println("URI출력 형태 : " + file.toURI());
		
		//toURL()는 사용금지 되었다.
//		System.out.println("URL출력 형태 : " + file.toURL());
		
		//생성자의 매개변수로 File 객체를 받고있다.
//		FileInputStream fis = new FileInputStream(file);
		FileInputStream fis = new FileInputStream("/Users/hyejilee/eclipse-workspace/Practice_Chap26(IO기반 입출력 Part-2)");
		
		int data;
		int i = 0; //한바이트씩 읽기위해서 0으로값줌
		
		while( (data = fis.read()) != -1) {
			System.out.print((char)data);
			
			//콘솔 출력 (원래 system.out.println()을 사용해도 무방하나, 1바이트씩 읽다보니 한글이 깨지는 경우가 있기때문에 write()써도 괜찮다. 역시 출력스트림이기때문에 가능.
//			System.out.write(data);
			
			i++;
		}
		System.out.println("루핑 수 : " + i);
		fis.close();
		
	}

}
