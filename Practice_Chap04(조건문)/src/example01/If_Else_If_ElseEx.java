package example01;

import java.util.Scanner;

public class If_Else_If_ElseEx {

	public static void main(String[] args) {
		
		//Resource이기 때문에 닫아줘야한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		//score변수의 값에 따라서 아래 조건문에서 분기가 일어나고있는 점을
		//이 예제의 핵심이다.
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("점수가 90~100점 사이입니다.");
			System.out.println("등급은 A입니다.");
		}
		else if(score >= 80) {
			System.out.println("점수가 80~89점 사이입니다.");
			System.out.println("등급은 B입니다.");
		}
		else if(score >= 70) {
			System.out.println("점수가 70~79점 사이입니다.");
			System.out.println("등급은 C입니다.");
		}
		else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		sc.close();
		
	}
}
