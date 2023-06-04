package example02;

public class BitOperatorEx {

	public static void main(String[] args) {
		
		//&(앤드) , |(오아) , ^(엑스오아) 베타적논리합 3개를 [비트연산자]라고 한다.
		
		int x = 8;
		int y = 5;
		
		System.out.println("x를 2진수로 변환 결과 : " + Integer.toBinaryString(x));
		System.out.println("y를 2진수로 변환 결과 : " + Integer.toBinaryString(y));
		//AND연산은 둘다 1일 때만 1을 준다.
		//OR연산은 하나라도 1이면 1을 준다.
		//XOR(exclusive or) 베타적 논리합 : 서로 다를 때 1을 준다.
		
		System.out.println("x와 y를 비트&(and)연산 결과 : " + (x & y));
		System.out.println("x와 y를 비트|(or)연산 결과 : " + (x | y));
		System.out.println("x와 y를 비트^(xor)연산 결과 : " + (x ^ y));
	}

}
