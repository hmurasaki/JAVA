package example01;

public class If_If_elseEx {

	public static void main(String[] args) {
		
		int score = 93;
		
		//몇 수십개의 if문이 존재하더라도, CPU는 모든 if문을 참조합니다.(비효율적인 코드)
//		if(score > 90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		}
//		
//		if(score > 80) {
//			System.out.println("점수가 80보다 큽니다.");
//			//System.out.println("등급은 A입니다.");
//		}
//		
//		if(score > 92) {
//			System.out.println("점수가 90보다 큽니다.");
//			//System.out.println("등급은 A입니다.");
//		}
		
		//if-else구문은 50%확률일 때, 사용하는게 바람직하다.
		//else구문 옆에는 조건문이 절대로 오면 안된다.
		if(score >= 90) {
			System.out.println("90점 이상입니다.");
		}
		else {
			System.out.println("90점 미만입니다.");
		}
		
	}

}
