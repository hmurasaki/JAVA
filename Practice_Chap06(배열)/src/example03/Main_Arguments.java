package example03;

public class Main_Arguments {

	public static void main(String[] ab) {
		//main()의 매개변수의 활용하는 방법. (String[])
		if(ab.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("아이디입력 패스워드입력");
		}
		
		String str1 = ab[0];
		String str2 = ab[1];
		String str3 = ab[2];
		
		System.out.println("아이디 : " + str1);
		System.out.println("패스워드 : " + str2);
		
		//
		int count = Integer.parseInt(str1);
		int total = count + 500;
		System.out.println("count값 : " + count);
	}

}
