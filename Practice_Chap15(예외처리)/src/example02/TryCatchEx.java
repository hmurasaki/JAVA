package example02;

public class TryCatchEx {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(2/0);             //산술예외 ArithmethicException발생.
			System.out.println(5);               //위에서 예외가 터졌기때문에 출력이 안됨.
		}catch (ArithmeticException e) {
			System.out.println(6);
		}
		System.out.println(7);
		
	}

}
