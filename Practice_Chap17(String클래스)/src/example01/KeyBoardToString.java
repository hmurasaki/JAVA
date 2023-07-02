package example01;

import java.io.IOException;

public class KeyBoardToString {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		//System.out.println(bytes[99]);  //초기화 확인
		
		System.out.print("입력 : ");
		int readBytesNo = 0;
		
		try {
			//키보드(표준입력)으로 부터 입력을 받고, 그 내용을 bytes에 저장을 하고 입력받은 바이트수를 return함.
			readBytesNo = System.in.read(bytes);
			//문자셋 EUC-KR로 디코딩한다.
//			String str = new String(bytes, 0, readBytesNo-2, "UTF-8");       //EUC-KR 출력이안되서 UTF-8로
//			String str = new String(bytes, 0, readBytesNo-2, "EUC-KR");
//			System.out.println(str);
//			System.out.println("입력받은 바이트 수 : " + readBytesNo);
			
//			//EUC-KR : 한글이 2바이트  / UTF-8 : 한글이 3바이트
//			byte[] b = str.getBytes("UTF-8");
//			System.out.println(b.length);
			
			//인코딩과 디코딩의 과정에서 반드시 문자셋은 동일하게 가져가야 글자가 깨지는 오류를 방지할 수 있다.
			byte[] b2 = "안녕하세요".getBytes();
			String str1 = new String(b2, 0, b2.length, "UTF-8");
//			String str1 = new String(b2, 0, b2.length, "EUC-KR");
			System.out.println(str1);
			
			System.out.println(b2.length);
			
			
		} catch (IOException e) {}
		
	}

}
