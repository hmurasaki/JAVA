package example02;

public class ToLowerUpperEx {

	public static void main(String[] args) {
		
		String str1 = "Java Prpgraming";
		String str2 = "JAVA Prpgraming";
		
		System.out.println("대문자 : " + str1.toUpperCase());        //전부 대문자로 바꿔서 출력해줌
		System.out.println("소문자 : " + str1.toLowerCase());        //전부 소문자로 바꿔서 출력해줌  
		
		System.out.println(str1.equals(str2));     //대소문자 비교해서 동일하면 true/틀리면 false 당연히 false나온다
		System.out.println(str1.equalsIgnoreCase(str2));     //대소문자 구별없이 비교하고자한다면 equalsIgnoreCase . 문자열이같으면 true반환.	
		
	}

}
