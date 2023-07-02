package example03;

public class ReverseEx {

	public static void main(String[] args) {
		
		//하드코딩
		String str = "안녕하세요";
		String reverse = ""; //초기화
		int count = 0;
		
		String r = reverseString(str);
		System.out.println("reverseString() 호출 후 : " + r);
		
		count = str.length();
		System.out.println("문자열 길이 : " + count);
		
		//하드코딩의 리버스출력
		for(int i=0; i<count; i++) {
			reverse += str.charAt(count - (i+1));     //문자열 count 5 에서 - i+1 
			System.out.println(reverse);
//			System.out.println(reverse.hashCode());    //문자열마다 주소다다름
		}
		System.out.println("역순 출력 : " + reverse);
		
	}
		//이지코딩 
		public static String reverseString(String str) {
			return new StringBuilder(str).reverse().toString();
	}

}
