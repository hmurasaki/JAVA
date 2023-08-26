package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FIle_CopyEx {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fInputStream = new FileInputStream("/Users/hyejilee/Desktop/공부/write.rtf");
		
		FileOutputStream fOutputStream = new FileOutputStream("/Users/hyejilee/Desktop/공부/write_복사본.rtf");  //내보낸다.
		
		byte[] readBytes = new byte[1000];
		int data = 0;
		while( (data=fInputStream.read(readBytes)) != -1) {
			fOutputStream.write(readBytes);
			System.out.println("읽은 바이트 수 : " + data);
		}
		System.out.println("C드라이브에 write_복사본.txt파일이 생성되었습니다.");
		
		
		fOutputStream.close();
		fInputStream.close();
	}

}
