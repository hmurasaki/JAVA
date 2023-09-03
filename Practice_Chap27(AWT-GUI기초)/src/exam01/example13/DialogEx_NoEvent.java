package exam01.example13;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class DialogEx_NoEvent {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Dialog");
		frame.setSize(500, 500);
		
/*		parent Frame을 (상속관계아님) frame으로 하고, modal을 true로 해서
		필수응답 Dialog로 한다. 이렇게 되면 Dialog창이 닫혀야 주윈도우인 Frame을 사용할 수가 있다.
		하지만 false로 설정을 하게되면 독립적으로 서로 행동한다.
*/
		
		
		Dialog dialog = new Dialog(frame, "info", true);
		dialog.setSize(150, 100);
		
		//Dialog의 위치기준은 독립적인 컨테이너이기 때문에 윈도우를 기준으로 위치를 잡는다.
		dialog.setLocation(550, 50);      //기준이되는 것은 윈도우크기의 좌표값.
		dialog.setLayout(new FlowLayout());
		
		Label label = new Label("이 다이얼로그는 모달임", Label.CENTER);
		Button button = new Button("확인");
		
		dialog.add(label);
		dialog.add(button);
		
		frame.setVisible(true);
		dialog.setVisible(true);
		
		
		
		
		
		
		
	}

}
