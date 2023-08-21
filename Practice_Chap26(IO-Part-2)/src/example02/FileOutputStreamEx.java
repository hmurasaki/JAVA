package example02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	//JPG복사 + mp4 + 엑셀 + 피피티 
	public static void main(String[] args) throws Exception{
		
		//파일을 복사하기 위해 경로를 설정
		//이미지 우클릭 > properties > 로케이션
		String oriFileName = "/Users/hyejilee/eclipse-workspace/Practice_Chap26(IO기반 입출력 Part-2)/src/example02/01.jpg";
		String tarFileName = "/Users/hyejilee/eclipse-workspace/Practice_Chap26(IO기반 입출력 Part-2)/src/01.jpg";
		
		File file = new File(oriFileName);
		FileInputStream fis = new FileInputStream(file);  //파일로부터 데이터를 복사
		FileOutputStream fos = new FileOutputStream(tarFileName);  //복사한 파일을 출력
		
		int readByteCount; //읽은값을 리턴하는걸 확인
		int i = 0;
		
		
		//바이트 배열을 크게 잡을수록 복사시간이 빨라진다.
		//byte[] bArr = new byte[100]; 약 11초
		//byte[] bArr = new byte[1000]; 약 2.4초
		//byte[] bArr = new byte[10000]; 약 0.5초
		byte[] bArr = new byte[100000];   //약 0.2초
		
		long startTime = System.currentTimeMillis(); //현재 시점을 저장한다.
		
		while((readByteCount = fis.read(bArr)) != -1) {
//			fos.write(bArr);
			fos.write(bArr, 0, readByteCount);    //읽은 바이트 수 만큼 출력스트림으로 보내는 것.
			
			i++;
		}
		fos.flush();
		long endTime = System.currentTimeMillis();  //복사의 종료 시점
		System.out.println("총 루핑 수 : " + i); 
		System.out.println("복사 시간 : " + (endTime - startTime) + "ms");
		System.out.println("복사한 파일의 크기 : " + (file.length()/1024) + "KByte");
		
		
		
		fos.close();
		fis.close();
		System.out.println(file.getName() + "파일의 복사가 완료되었습니다.");
	}

}
