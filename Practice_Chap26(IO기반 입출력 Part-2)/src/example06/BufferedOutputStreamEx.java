package example06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/hyejilee/eclipse-workspace/Practice_Chap26(IO기반 입출력 Part-2)/src/example06/안녕하세요.rtf");
		System.out.println("파일의 크기 : " + (file.length())/1024 + "Kbyte");
		
		//주스트림
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		
		//보조스트림
		BufferedInputStream bInputStream = null;
		BufferedOutputStream bOutputStream = null;
		
		int dataCount = 0;
		long start = 0;
		long end = 0;
		
		//주스트림에 보조스트림을 연결함 ( 입력 ) 
		fInputStream = new FileInputStream(file);
		bInputStream = new BufferedInputStream(fInputStream);
		
		//주스트림에 보조스트림을 연결함 ( 출력 )
		fOutputStream = new FileOutputStream("/Users/hyejilee/Desktop/공부/Temp/안녕하세요.rtf");
		bOutputStream = new BufferedOutputStream(fOutputStream);
		
		start = System.currentTimeMillis();       //읽고 저장하기 전 시간을 저장
		
		//1바이트씩 읽고 1바이트씩 저장하는 경
		while((dataCount = bInputStream.read()) != -1) {
			fOutputStream.write(dataCount);
		}
		fOutputStream.flush();
		end = System.currentTimeMillis();       //읽고 저장한 후 시간을 저장
		
		System.out.println("BufferedOutputStream을 사용하지 않았을 때 : " + (end-start) + "ms");
		
		
		bOutputStream.close();
		bInputStream.close();
		fOutputStream.close();
		fInputStream.close();
	}

}
