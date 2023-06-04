package example01;

public class OperatoerEx {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		System.out.println("더하기 결과 : " + result);
		
		result = v1 - v2;
		System.out.println("빼기 결과 : " + result);
		
		result = v1 * v2;
		System.out.println("곱하기 결과 : " + result);
		
		result = v1 / v2;
		System.out.println("나누기 결과 : " + result);
		
		result = v1 % v2; //%는 나머지를 구하는 연산
		System.out.println("나머지 결과 : " + result);
		
		result = v1 / 0; //산술연산예외가 발생하는 부분
		System.out.println("곱하기 결과 : " + result);
		
	}

}
