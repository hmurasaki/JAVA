package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		//control+shift+o =자동임포트
		//Scanner 클래스는 [입력을 받기 위한 클래스]이고 [입력스트림]이다.
		//자원(Resource)은 사용하고나서 반드시 닫아줘야 한다.
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한자리를 입력 : ");
//		int num = sc.nextInt();
//		System.out.println("사용자로부터 입력받은 숫자 : " + num);
//		
//		System.out.print("실수 한자리를 입력 : ");
//		double dnum = sc.nextDouble();
//		System.out.println("사용자로부터 입력받은 숫자 : " + dnum);
		
		System.out.print("문자열을 입력 : ");
//		String str = sc.next(); //next()는 공백을 기준으로 해서 문자를 입력 -- 단어를 입력 받을 때
//		String str = sc.nextLine(); //nextLine()은 엔터키를 입 할 때 까지 문자열을 입력 -- 문장을 입력 받을 때
//		System.out.println("사용자로부터 입력받은 문자열 : " + str);
		
		int result = 100;
		String num = sc.nextLine();
		
		int temp = Integer.parseInt(num); //해당 메서드는 문자열로 입력받은 숫자들을 문자열이 아니라 숫자로 바꿔주는 역할을 하는 메서드
		int total = result + temp;
		System.out.println("연산결과 : " + total);
		
		
		sc.close();
		
	}

}
