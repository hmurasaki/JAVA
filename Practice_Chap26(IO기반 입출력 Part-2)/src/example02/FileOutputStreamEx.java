package example02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.sound.midi.SysexMessage;

public class FileOutputStreamEx {

	public static void main(String[] args) throws Exception {
		
		//파일을 복사 하기 위해 경로를 설정
//		String oriFileName = "/Users/hyejilee/eclipse-workspace/Practice_Chap25(IO기반 입출력 Part-2)/src/example02/01.jpg";
		String oriFileName = "/Users/hyejilee/eclipse-workspace/Practice_Chap25(IO기반 입출력 Part-2)/src/example02/안녕하세요.rtf";
//		String tarFileName = "/Users/hyejilee/Desktop/01.jpg";
		String tarFileName = "/Users/hyejilee/Desktop/안녕하세요.rtf";
		
		File file = new File(oriFileName);      //컨쉬오
		FileInputStream fis = new FileInputStream(file);    //컨쉬오        파일로부터 데이터를 복사
		FileOutputStream fos = new FileOutputStream(tarFileName);  //컨쉬오   복사한 파일 출력
		
		int readByteCount;
		int i = 0;
		
		//바이트 배열을 크게 잡을수록 복사시간이 빨라진다.
		byte[] bArr = new byte[100];
		
		long startTime = System.currentTimeMillis();    //현재시점을 저장한다
		
		while((readByteCount = fis.read(bArr)) != -1) {
//			fos.write(bArr);
			fos.write(bArr, 0, readByteCount);       //읽은 바이트 수 만큼 출력스트림으로 보내는 것이다.
			i ++;
		}
		fos.flush();
		long endTime = System.currentTimeMillis();    //복사의 종료시점
		System.out.println("총 루핑 수 : " + i);
		System.out.println("복사 시간 : " + (endTime - startTime) + "ms");
		System.out.println("복사한 파일의 크기 : " + (file.length()/1024) + "Kbyte");
		
		fos.close();
		fis.close();
		System.out.println(file.getName() + "파일의 복사가 완료되었습니다.");
		
		
		
	}

}
