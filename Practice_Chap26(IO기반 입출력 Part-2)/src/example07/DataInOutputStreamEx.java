package example07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInOutputStreamEx {

	public static void main(String[] args) throws Exception {
		
		//파일객체 생성
		File file = new File("/Users/hyejilee/Desktop/공부/Temp/primitiveData.dat");
		
		//주 스트림 생성
		FileOutputStream fOutputStream = new FileOutputStream(file);
		System.out.println("파일의 크기 : " + file.length());     //0바이트
		
		//보조스트림 연결
		//기본타입(int,long,double,float,String ...등) 출력을 하기 위한 스트림이 바로 DataOutputStream이다.
		DataOutputStream dOutputStream = new DataOutputStream(fOutputStream);
		
		//String을 파일에 저장하기 위해서는 writeUTF()를 사용하는데, 한글은 3바이트, 영문자는 1바이트 인식한다.
		//하지만 String 내보낼 경우 2바이트가 포함된다.
		dOutputStream.writeUTF("신은혁");          //11바이트 추가
		System.out.println("신은혁 저장 후 - 파일의 크기 : " + file.length());
		dOutputStream.writeDouble(100.15);       //8바이트 추가
		System.out.println("100.15 저장 후 - 파일의 크기 : " + file.length());
		dOutputStream.writeInt(777);                //4바이트 추가
		System.out.println("777 저장 후 - 파일의 크기 : " + file.length());
		
		dOutputStream.writeUTF("김연아");          //11바이트 추가
		System.out.println("김연아 저장 후 - 파일의 크기 : " + file.length());
		dOutputStream.writeDouble(717.15);       //8바이트 추가
		System.out.println("717.15 저장 후 - 파일의 크기 : " + file.length());
		dOutputStream.writeInt(555);                //4바이트 추가
		System.out.println("555 저장 후 - 파일의 크기 : " + file.length());
		
		//자원해제
		dOutputStream.flush();
		dOutputStream.close();
		fOutputStream.close();
		
		System.out.println();
		System.out.println("읽어오는 데이터 출력");
		
		//주스트림 생성
		FileInputStream fInputStream = new FileInputStream(file);
		//보조스트림 연결
		DataInputStream dInputStream = new DataInputStream(fInputStream);
		
		//프로그램으로 읽어들일 때에는 저장할때의 순서와 반드시 동일하게 읽어와야 한다.(중요)
		for(int i=0; i<2; i++) {
			System.out.println((i+1) + "번째 읽은 문자열 : " + dInputStream.readUTF());
			System.out.println((i+1) + "번째 읽은 double값 : " + dInputStream.readDouble());
			System.out.println((i+1) + "번째 읽은 Int값 : " + dInputStream.readInt());
			System.out.println();
		}
		System.out.println("파일크기(byte) : " + file.length() + "byte 읽었습니다.");
		
		
		
	}

}
