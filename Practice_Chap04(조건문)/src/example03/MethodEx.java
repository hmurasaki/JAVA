package example03;

public class MethodEx {
	
	//메서드의 선언부 구성
	//1. 리턴타입(반환값) : 아래에서 int
	//2. 메서드명 : add
	//3. () : 매개변수=인자값=Arguments
	//메서드의 선언부(중요도 99%), 메서드의 구현부(정의부)
	public static int add(int x1, int y1, int z1) {
		//int temp = 0;
		//temp = x1 + y1 + z1;
		System.out.println("add메서드 호출됨");
		return x1 + y1 + z1;
	}
	
	public static int minus(int x1, int y1) {
		System.out.println("minus메서드 호출됨");
		return x1 - y1;
	}
	//multiply(곱셈), divide(나눗셈)
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 30;
		
		//값에의한 복사 = 콜바이밸류(call by value)
		int result = add(num1, num2, 100);
		System.out.println("num1 + num2 + 100 : " + result);
		
		//값에의한 복사 = 콜바이밸류(call by value)
		result = minus(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
		
	}

}
