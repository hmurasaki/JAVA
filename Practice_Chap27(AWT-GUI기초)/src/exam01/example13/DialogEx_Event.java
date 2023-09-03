package exam01.example13;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogEx_Event {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Dialog");
		frame.setSize(500, 500);
		
		
		Dialog dialog = new Dialog(frame, "info", true);
		dialog.setSize(150, 100);
		
		dialog.setLocation(550, 50);    
		dialog.setLayout(new FlowLayout());
		
		Label label = new Label("이 다이얼로그는 모달임", Label.CENTER);
		Button button = new Button("확인");
		
/*		이벤트처리 (Button을 클릭하면 dialog가 사라진다. 아울러 dispose()에 의해서
		메모리에서도 제거가 된다.
*/		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//확인을누르면 다이얼로그가 사라지게끔하기
				System.out.println("다이얼로그 버튼 이벤트 발생");
				dialog.setVisible(false);
				dialog.dispose();    //메모리에서 제거
			}
		});
	
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("윈도우 종료 이벤트 발생");
				System.exit(0);    //종료하기
			}
		});
		
		dialog.add(label);
		dialog.add(button);
		frame.setVisible(true);
		dialog.setVisible(true);
	}

}
