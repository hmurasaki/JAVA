package example09;

import java.io.OutputStream;

public class SystemOutEx {

	public static void main(String[] args) throws Exception {
		
		//PrintStream(System.out)은 OutputStream의 자손이다.
		//고로 얼마든지 대입이 가능하다 (다형성)
		OutputStream oStream = System.out;
		
		//아스키코드 표 출력
		for(byte b=48; b<58; b++) {
			System.out.print("아스키코드 write()후 출력된 문자 값 : ");
			System.out.print(b + "\t");
			oStream.write(b);
			System.out.println();
		}
		oStream.write(13);     // write(13) = println 개행
		
		for(byte b=97; b<127; b++) {
			System.out.print("아스키코드 write()후 출력된 문자 값 : ");
			System.out.print(b + "\t");
			oStream.write(b);
			System.out.println();
		}
		oStream.write(13); 
		
		String str = "저는 자바공부를 열심히 하는 사람 입니다.";
		byte[] bArr = str.getBytes();
		
//		for(int i=0; i<bArr.length; i++) {
//			System.out.println((char)bArr[i]);
//		}
		
		oStream.write(bArr); //한번에 문자열을 출력함
		oStream.flush();
		oStream.close();
		
	}

}
