package example04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료 하시려면, Q를 입력하세요");
		String str = null;
		
		//do-while문은 최소 한번 이상 무조건 수행을 하는 반복문이다.
		//그 이유는 조건문이 뒷부분에 존재하기 때문이다.
		do {
			
			System.out.print(">");
			//String클래스 next()메서드는 공백까지만 리턴을 한다.
			//next() 한단어 입력받을 때 쓸 수 있는 메서드.
			//nextLine() 공백 포함하여 엔터키를 입력 할 때까지 문장을 리턴.
			str = sc.next();
			System.out.println("입력받은 메세지 : " + str);
			
		}while(!str.equals("Q"));
		
		System.out.println("프로그램 종료");
		sc.close();
		
	}

}
