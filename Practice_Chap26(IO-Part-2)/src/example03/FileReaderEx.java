package example03;

import java.io.File;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) throws Exception {
		
		
		File filePath = new File("/Users/hyejilee/eclipse-workspace/Practice_Chap26(IO기반 입출력 Part-2)/src/example03/files/여성가족부 담화문.rtf");
		System.out.println(filePath.getCanonicalPath());
		//???Reader, ???Writer 붙는 클래스들은 문자특화기반 클래스이다.
		//동영상, 사진 , 오디오 등 2진파일들은 읽을 수 없음
		FileReader fiReader = new FileReader(filePath);
//		System.out.println("파일 크기 : " + filePath.length());
		
		int readCharNo;  //읽은 문자의 갯수를 받기위헤
		
		//char[]의 사이즈가 크면 클 수록 역시 많은 데이터를 한번에 읽기 때문에 속도가 향상된다.
		char[] cArr = new char[1000];    //200byte할당  한문자가 2바이트니까
		int i = 0;
		
		while((readCharNo = fiReader.read(cArr)) != -1) {
			String str = new String(cArr, 0, readCharNo);
			System.out.print(str);
			i++;
		}
		
//		System.out.println();
		System.out.write(13);  //개행 줄바꿈
		System.out.println("루핑 수 : " + i);
		
		
		
		fiReader.close();
		
	}

}
