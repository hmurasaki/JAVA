package example02;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class OutPutStreamEx01 {

	public static void main(String[] args) throws Exception {
		
		//파일로부터 출력스트림을 생성하여 대입한다.(다형성)	
		OutputStream oStream = new FileOutputStream("/Users/hyejilee/Desktop/공부/write.rtf");
		
		//"ABC"라는 문자열에서 byte[]바이트배열을 얻어내는 것이다.(인코딩)	
	 	byte[] data = "ABC".getBytes();
	 	System.out.println(Arrays.toString(data));       //아스키코드가 출력됨.	
	 	
	 	//3번 루핑한다.. 한글자씩 보내니까..
	 	for(int i=0; i<data.length; i++) {
	 		oStream.write(data[i]);
	 	}
	 	//wite()를 사용하면 무조건 flush()를 호출하여, 메모리 버퍼를 비우도록 하자 (잔류하고있는게있으면 다음 입력이나 무엇을 할 때 충돌될 소지가있음)
	 	//main()가 종료하면 알아서 버퍼에서 나가지만, 웬만하면 flush()를 호출하도록 하는 것을 습관화하도록 하자.
	 	oStream.flush();
	 	System.out.println("저장이 완료되었습니다.");
		
		
		
		
		
		
		
		oStream.close();
		
		
		
	}

}
