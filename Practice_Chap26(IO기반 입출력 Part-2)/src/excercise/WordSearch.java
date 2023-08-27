package excercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {

	public static void main(String[] args) {
		
		//단어찾기 프로그램 문제
		
		//단어를 저장할 곳을 만들어야함.
		Vector<String> vector = new Vector<>();
		
		File file = new File("/Users/hyejilee/eclipse-workspace/Practice_Chap26(IO기반 입출력 Part-2)/src/excercise/words.rtf");
		System.out.println("파일 크기 : " + file.length()/1024 + "kbyte");
		try {
			Scanner fScanner = new Scanner(file);
			while(fScanner.hasNext()) {
				vector.add(fScanner.next());      //공백포함하지않고 공백이전까지 저장하는 next()메서드
			}
			fScanner.close();
		} catch (FileNotFoundException e) {e.printStackTrace();}
		
		System.out.println("Vector에 저장된 단어들 출력해보기");
		
		for(int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		//단어 검색하기
		Scanner scanner = new Scanner(System.in);
		while(true) {
			boolean found = false;       //flag변수
			System.out.print("찾을 단어 입력 (종료는 exit) >> ");
			String search = scanner.next();
			
			
			//검색종료 코드
			if(search.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			  
			for(int i=0; i<vector.size(); i++) {
				String vs = vector.get(i);     //벡터내의 문자열을 가져오는 것
//				if(vs.length() < search.length())       //apple  = aaaaa 만족한다 왜냐 길이가 같으니까. !=를 넣을경우
//					continue;
//				if(vs.length() > search.length())
//					continue;
				
				if(search.equals(vs)) {
					System.out.println("찾은 문자 : " + vs);
					found = true;
				}
			}
			if(!found) {    //못찾았을경우
				System.out.println("찾는 단어가 없습니다.");
			}
		}
		scanner.close();
	}

}
