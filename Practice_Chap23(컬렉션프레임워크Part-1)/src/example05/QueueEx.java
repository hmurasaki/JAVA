package example05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

		Queue<Message> mQueue = new LinkedList<>();

		mQueue.offer(new Message("sendMail", "홍길동"));
		mQueue.offer(new Message("sendSMS", "김연아"));
		mQueue.offer(new Message("sendKakaoTalk", "신은혁"));
		mQueue.offer(new Message("sendFaceBook", "홍진영"));

		while(!mQueue.isEmpty()) {
			Message message = mQueue.poll();
			System.out.println(mQueue.size());

			switch(message.getCommand()) {
				case "sendMail" : 
					System.out.println(message.getTo() + "에게 Mail을 보냅니다.");
					break;
				case "sendSMS" : 
					System.out.println(message.getTo() + "에게 SMS을 보냅니다.");
					break;
				case "sendKakaoTalk" : 
					System.out.println(message.getTo() + "에게 KakaoTalk을 보냅니다.");
					break;	
				case "sendFaceBook" : 
					System.out.println(message.getTo() + "에게 DM을 보냅니다.");
					break;	
			}
		}
	}

}
