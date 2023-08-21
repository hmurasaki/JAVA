package example09;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		
		Console console = System.console(); //정적메서드
		
		//Console클래스는 실행시 이클립스의 콘솔뷰에서 하게 되면 널포인터익셉션(NullPointerException) 발생
		//반드시 명령 프롬포트에서 실행해야 한다.
		System.out.print("아이디 : ");
		String id = console.readLine();      //아이디값을 받음.
		
		//console클래스에서는 기본타입을 받을 수 있는 메서드 자체가 없다.
		
		System.out.print("패스워드 : ");
		//콘솔창(명령프롬포트)에 입력한 문자가 에코출력을 함. 즉 보이지 않음.
		char[] password =  console.readPassword();
		
		String pStr = new String(password);
		System.out.println("----------------------------------");
		System.out.println("id : " + id);
		System.out.println("pwd : " + pStr);
		
	}

}
