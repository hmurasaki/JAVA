package example01;

public class SenderEx {

	public static void main(String[] args) {
		//추상클래스이니 절대 인스턴스를 생성할 수 없다.	
		//ContentSender contentSender = new ContentSender();
		//추상클래스도 조상이니깐 필드의 다형성 적용됨.
		ContentSender contentSender1 = new KakaoSender("카카오톡", "홍길동", "안녕!홍길동이야!");
		contentSender1.sendMessage("김연아");
		System.out.println();
		
		ContentSender cotentSender2 = new SmsSender("SMS", "공유", "반가워");
		cotentSender2.sendMessage("손연재");
	}

}
