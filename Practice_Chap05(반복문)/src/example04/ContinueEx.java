package example04;

public class ContinueEx {

	public static void main(String[] args) {
		
//		//1~100까지 사이에서 홀수,짝수만 출력하기는 프로그램을 만들어보자.
//		
//		for(int i=1; i<=100; i++) {
//			//continue문은 뒷문장은 실행하지 아니하고 바로 증감식으로 이동한다.
//			if( (i%2) == 0 ) {     //짝수만 출력시 ( (i%2) != 0 )
//				continue;
//			}
//			
//			System.out.println("홀수만 출력 : " +i);
//		}
		for(int i=1; i<=100; i++) {
			if( (i%2) == 0 && (i%3) == 0 ) {
				System.out.println("2와 3의 공배수 출력 : " +i);
			}
			
		}
		//소수를 구하는 프로그램을 작성하시오.
	}

}
