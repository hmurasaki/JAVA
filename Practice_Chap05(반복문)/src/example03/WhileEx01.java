package example03;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1; //while문은 초기화 하는 부분이 따로 존재하지 않는다.
		
		//while문 옆에는 조건식만 들어가기 때문에 for문에 비해서 일반적루핑에서는
		//가독성이 떨어진다.
//		while(i<=100) {
//			sum += i;
//			i++;
//		}
		
		//c언어에서는 따로 boolean타입이 없다. 0이 거짓, 0을 제외한 모든 값들은 참으로 인식한다.
		//while문은 무한루프용으로 많이 사용된다. if()문과 break문과 함께 무한루프를 벗어날 코드를 작성을 하는게 좋다.
		while(true) { //<-무한루프 
			System.out.println(i);
			if(i>=100) {
				break;
			}
			i++;
		}
		
		
//		System.out.println("1~100까지의 합 : " + sum);
	}

}
