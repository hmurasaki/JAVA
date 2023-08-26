package example04;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

public class WriteEx01 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("/Users/hyejilee/Desktop/공부/text.rtf");
		
		char[] str = "홍길동".toCharArray();       //toCharArray() = 문자배열(캐리터배열)/문자열을 캐리터배열로 리턴해주는 것
		System.out.println(Arrays.toString(str));
		
		for(int i=0; i<str.length; i++) {
			//한 문자씩 보내는 형태
			writer.write(str[i]);
			System.out.println("루핑 수 : " + i);
		}
		writer.flush();     //강제로 버퍼를 비워준다.
		System.out.println("파일이 생성되었습니다.");
		writer.close();
	}

}
