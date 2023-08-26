package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx03 {

	public static void main(String[] args) throws Exception {
		
		InputStream iStream = new FileInputStream("/Users/hyejilee/Desktop/공부/text.rtf");
		int count;
		byte[] readByte = new byte[8];

		//시작 인덱스가 2이고, 3개만 읽어서 저장하는 코드를 작성한다
		count = iStream.read(readByte, 2, 4);
		System.out.println("읽은 바이트 수 : " + count);
		System.out.println();
		
		for(Byte b : readByte) {
			System.out.println("읽은 바이트 : " + b);
		}
		
		
		
		
		
		
		
		iStream.close();
		
		
	}

}
