package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx04 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("/Users/hyejilee/Desktop/공부/text.rtf");
		
		String str = "안녕하세요.지금 자바를 가르치고 있어요.";
		
		//매개변수가 String타입이다. 하여 String을 그대로 파일에 저장하게 된다.
		//writer.write(str);
		writer.write(str, 2, 10);          //[하세요.지금 자바를] 까지만 출력 된다. 공백포함!!!!!!!!!
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		
		
		writer.close();
		
	}

}
