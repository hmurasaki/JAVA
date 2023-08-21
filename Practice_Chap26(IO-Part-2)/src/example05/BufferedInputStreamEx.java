package example05;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws Exception {
		
		long start = 0;
		long end = 0;
		File file = new File("/Users/hyejilee/eclipse-workspace/Practice_Chap26(IO기반 입출력 Part-2)/src/example05/01.jpg");
		
		//바이트 기반으로 속도의 차이를 보기 위한 프로그램 작성해본다.
		FileInputStream fStream1 = new FileInputStream(file);
		System.out.println("File의 크기 : " + file.length());   //약 2.3MByte
		
		System.out.println("바이트 기반 읽기 시작");
		start = System.currentTimeMillis();
		//그냥 읽기만 함.
		while(fStream1.read() != -1) {}
		System.out.println("바이트 기반 읽기 끝");
		end = System.currentTimeMillis();
		//약 1.189초 소요됨.
		System.out.println("버퍼를 사용하지 않았을 때(바이트 기반) : " + (end-start) + "ms");   
		
		fStream1.close();
		
		System.out.println();
		
		//주입력스트림인 FileInputStream에다가 속도 및 성능 향상 보조스트림인 BufferedInputStream을 연결한다.
		//실질적으로 file을 읽어오는 스트림은 바로 주스트림이고, 읽어온 데이터를 빨리 처리해주는 역할이 보조스트림인 BufferedInputStream이다.
		FileInputStream fStream2 = new FileInputStream(file);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);
		
		System.out.println("버퍼 기반 읽기 시작");
		start = System.currentTimeMillis();
		while(bStream.read() != -1) {}
		System.out.println("버퍼 기반 읽기 끝");
		end = System.currentTimeMillis();
		
		System.out.println("버퍼를 사용 했을 때(버퍼 기반) : " + (end-start) + "ms");   //0.017 초
		
		bStream.close();
		fStream2.close();
	
	}

}
