package example06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.sound.midi.SysexMessage;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws Exception{
		
		File file = new File("/Users/hyejilee/eclipse-workspace/Practice_Chap26(IO기반 입출력 Part-2)/src/example06/01.jpg");
		
		System.out.println("파일 용량 : " + ((file.length()) /1024)/1024 + "Mbyte");    //(file.lengh()/1024 = Kbyte
		
		//주 스트림
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		//보조 스트림
		BufferedInputStream bInputStream = null;
		BufferedOutputStream bOutputStream = null;
		
		int dataCount = 0;
		long start = 0;
		long end = 0;
		byte[] bArr = new byte[10000];
		
		//주스트림에다가 보조스트림을 연결 함.(입력 읽어오는 것)
		fInputStream = new FileInputStream(file);
		bInputStream = new BufferedInputStream(fInputStream);   
		
		//주스트림에다가 보조스트림을 연결 함.(출력)
		fOutputStream = new FileOutputStream("/Users/hyejilee/Desktop/공부/01_복사본.jpg");
		bOutputStream = new BufferedOutputStream(fOutputStream);
		
		//BufferedOutputStream을 사용하지 않았을 때
		start = System.currentTimeMillis();    //읽고 저장하기 전 시간을 저장
		
		//1byte씩 읽고 1byte씩 저장하는 경우.
		while((dataCount = bInputStream.read(bArr)) != -1){
			fOutputStream.write(bArr, 0, dataCount);
		}
		fOutputStream.flush();
		end = System.currentTimeMillis();     //읽고 저장한 후 시간을 저장
		
		System.out.println("BufferedOutputStream을 사용하지 않았을 때 : " + (end-start) + "ms");
		
		
		System.out.println();
		
		
		//BufferedOutputStream을 사용 했을 때
		start = System.currentTimeMillis();    //읽고 저장하기 전 시간을 저장
		
		//1byte씩 읽고 1byte씩 저장하는 경우.
		while((dataCount = bInputStream.read(bArr)) != -1){
			bOutputStream.write(bArr, 0, dataCount);
		}
		bOutputStream.flush();
		end = System.currentTimeMillis();     //읽고 저장한 후 시간을 저장
		
		System.out.println("BufferedOutputStream을 사용했을 때 : " + (end-start) + "ms");
		
		//자원해제
		bOutputStream.close();
		bInputStream.close();
		fOutputStream.close();
		fInputStream.close();
		
		//결론 : 배열을 사용해서 적절하게 저장공간을 주고, 속도 및 성능향상을 위해서는 버퍼드인풋,아웃풋스트림을 보조스트림으로 연결하여 사용한다.
	}

}
