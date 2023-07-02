package example02;

public class ValueOfEx {

	public static void main(String[] args) {
		//String valueof는 정적메서드임
		String str1 = String.valueOf(true);
		System.out.println(str1);
		
		//수치를 string화 시키는 메서드
		//valueOf()메서드는 GUI프로그래밍에서 많이 등장함.
		String str2 = String.valueOf(777.888);
		System.out.println(str2);
		
				
	}

}
