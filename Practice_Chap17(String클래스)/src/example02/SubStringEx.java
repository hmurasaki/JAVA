package example02;

public class SubStringEx {

	public static void main(String[] args) {
		
		String phoneNum = "01012345678";
		
		//subString() 문자열을 잘라내어 다시 String로 반환
		String str1 = phoneNum.substring(3);     //0~출력하고싶은 곳 전을 없애줌
		System.out.println(str1);               //12345678만 출력된다.
		
		String str2 = phoneNum.substring(0, 3);  //0~출력하고싶은 곳까지 출력해줌
		System.out.println(str2);              //010만 출력된다.
		
	}

}
