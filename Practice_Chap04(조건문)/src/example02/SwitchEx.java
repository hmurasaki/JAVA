package example02;

public class SwitchEx {

	public static void main(String[] args) {
		
//		int score = 95;
//		
//		//int이하의 정수값, String값이 들어 올 수 있
//		switch(score) {
//			case 95 :
//				System.out.println("95점 입니다.");
//				break;
//			case 94 :
//				System.out.println("94점 입니다.");
//				break;
//			case 93 :
//				System.out.println("93점 입니다.");
//				break;
//		default :
//			System.out.println("잘못된 값 입니다.");
//		
		
		int score = 75;
		
		//int이하의 정수값, String값이 들어 올 수 있
		switch(score/10) {
			case 10 :
			case 9 :
				System.out.println("A등급 입니다.");
				break;
			case 8 :
				System.out.println("B등급 입니다.");
				break;
			case 7 :
				System.out.println("C등급 입니다.");
				break;
		default :
			System.out.println("D등급 이하 입니다.");
		}
		
	}

}
