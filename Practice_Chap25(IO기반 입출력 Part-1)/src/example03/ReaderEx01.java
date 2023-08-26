package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx01 {

	public static void main(String[] args) throws Exception {
		
		//Readerz클래스는 문자특화 클래스로써 하위클래스인 FileReader를 생성해서 대입.
		Reader reader = new FileReader("/Users/hyejilee/Desktop/공부/text.rtf");
		int readData;
		
		//readData는 int값으로 끝 2바이트(문자가 2바이트이니까)에 저장됨.
		while((readData = reader.read()) != -1) {
			//문자출력 (바이트정보를 강제 캐스팅)
			System.out.println("읽은 문자 : " + (char)readData);
			
			//영문자는 아스키코드가 출력이되고, 한글은 유니코드가 출력됨.
			System.out.println("읽은 문자 : " + readData);    //아스키코드가 출력된다
		}
		
//		while(true) {
//			readData = reader.read();
//			if(readData == -1)
//				break;
//		//문자출력 (바이트정보를 강제 캐스팅)
//		System.out.println("읽은 문자 : " + (char)readData);
//		
//		//영문자는 아스키코드가 출력이되고, 한글은 유니코드가 출력됨.
//		System.out.println("읽은 문자 : " + readData);    //아스키코드가 출력된다
//		}
		
		
		
		reader.close();
		
	}

}
