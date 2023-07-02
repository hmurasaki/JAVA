package example03;

public class SplitEx {

	public static void main(String[] args) {
		
		//매개변수를 갖는 문자열들이 특정한패턴에의해서 저장되는경우가많은데
//		String str1 = "사랑해,너를,교촌치킨,양념치킨";  
//		
//		String[] strArr = str1.split(",");
//		
//		for(String str : strArr)
//			System.out.println(str);
		
		//정규표현식 : / & , - 해당
		//split()메서드 : 매개변수로 정규표현식이 옴. 리턴타입은 정규표현식으로 구분되어진 String[]을 리턴한다.
		String str1 = "사랑해,너를/교촌치킨&양념치킨-순살치킨";  
		
		String[] strArr = str1.split(",|/|&|-");
		
		for(String str : strArr)
			System.out.println(str);
	}

}
