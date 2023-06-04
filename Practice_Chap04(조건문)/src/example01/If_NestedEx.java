package example01;

import java.util.Scanner;

public class If_NestedEx {

	public static void main(String[] args) {
		
		//중첩 if문
		
		//Resource이기 때문에 닫아줘야한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("당신은 A+등급 입니다.");
			}
			else {
				System.out.println("당신은 A0등급 입니다.");
			}
		}
		else if(score >= 80) {
			if(score >= 85) {
				System.out.println("당신은 B+등급 입니다.");
			}
			else {
				System.out.println("당신은 B0등급 입니다.");
			}
		}
		else if(score >= 70) {
			if(score >= 75) {
				System.out.println("당신은 C+등급 입니다.");
			}
			else {
				System.out.println("당신은 C0등급 입니다.");
			}
		}
		else if(score >= 60) {
			if(score >= 65) {
				System.out.println("당신은 D+등급 입니다.");
			}
			else {
				System.out.println("당신은 D0등급 입니다.");
			}
		}
		sc.close();
	}

}
