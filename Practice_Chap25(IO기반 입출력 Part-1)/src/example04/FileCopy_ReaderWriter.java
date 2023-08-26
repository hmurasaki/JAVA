package example04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy_ReaderWriter {
	
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("/Users/hyejilee/Desktop/공부/source.rtf");
		Writer writer = new FileWriter("/Users/hyejilee/Desktop/공부/source_복사본.rtf");
		
		
		String str = "";
		int readBytes;
		char[] cArr = new char[1000];      //배열값이 1000일경우(버퍼) 밑의 와일문은 필요없어진다.
		int i = 0;
		
//		while((readBytes = reader.read(cArr)) != -1) {
//			i++;
			readBytes = readBytes = reader.read(cArr);
			String str1 = new String(cArr);
//			str += str1;
//			System.out.println("루핑 수 : " + i);
//		}
		writer.write(str1);
		writer.flush();
		System.out.println("C드라이브에 source_복사본.rtf 파일이 생성되었습니다.");
		writer.close();
		reader.close();
		
		
	}
	
	
	
	
}
