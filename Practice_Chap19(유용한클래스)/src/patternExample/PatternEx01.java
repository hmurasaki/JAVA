package patternExample;

import java.util.regex.Pattern;

public class PatternEx01 {

	public static void main(String[] args) {
		//010,02로 시작하는휴대폰번호나 서울지역 전화번호를 패턴으로 정의
		//(010|02) : 소괄호를해서 그룹핑이되었다. 010이나 02가 와야한다는 뜻   {3,4} : 10진수 3자리나4자리를받겠다는 뜻  {4} : 무조건 4자리만 받는다는뜻
		String pattern = "(010|02)-\\d{3,4}-\\d{4}";     
		String phoneNum = "010-5544-1234";
		String seoulNum = "02-766-1234";
		
		
		//boolean result = Pattern.matches(pattern, phoneNum);
		boolean result = Pattern.matches(pattern, seoulNum);
		
		if(result) {
			System.out.println("전화번호 양식이 맞습니다.");
		}
		else {
			System.out.println("전화번호 양식이 맞지않습니다. 다시 입력해주세요.");
		}
		
		//이메일 양식을 검증하는 방법
		String email = "\\w+@\\w+\\.\\w+(\\.\\w+)*";
		String emailData1 = "7@naver.com";
		String emailData2 = "abcd@naver.co.kr";

		boolean emailResult = Pattern.matches(email, emailData2);
		
		if(emailResult) {
			System.out.println("이메일 양식이 맞습니다.");
		}
		else {
			System.out.println("이메일 양식이 맞지않습니다. 다시 입력해주세요.");
		}
		
	}

}
