package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx03 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("/Users/hyejilee/Desktop/공부/text.rtf");
		
		//문자열 > 문자배열로 리턴함.
		char[] str = "신은혁이다".toCharArray();
		
		writer.write(str, 1, 3);
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		
		writer.close();

	}

}
