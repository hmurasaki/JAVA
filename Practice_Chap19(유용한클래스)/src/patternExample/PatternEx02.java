package patternExample;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx02 {

	public static void main(String[] args) {
		
		String[] data = { "bat", "baby", "bonus", "ca", "cb", "c.", "car", "com", "date", "zoo", "disc" };
		
		//소문자 c로 시작하는 영어단어나 문장을 패턴으로 정의하는 코드
//		Pattern pattern = Pattern.compile("c[a-z]"); //c로시작을해서 문자를하나더받겠다. ex) c+? 두글자       //c[a-z]* 를하면 두글자이상.
		String pattern = "c[a-z]*";
		
		
		Vector<String> vStrings = new Vector<String>();
		
		for(String str : data) {
			boolean result = Pattern.matches(pattern, str);
			if(result) {
				System.out.println(str);
				vStrings.add(str);
			}
			
//			Matcher matcher = pattern.matcher(str);
			//정의를 한 패턴과 일치하는가?
//			if(matcher.matches()) {
//				System.out.println(str);
//				vStrings.add(str);
//			}
		}
		//벡터에 제대로저장되있는지 출력해보기
		System.out.println();
		System.out.println("c로 시작하는 소문자 영단어 : " + vStrings.toString());
		
		
	}

}
