package exam01.example02;

import java.awt.Button;
import java.awt.Frame;

public class ButtonEx02 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Button");
		
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		Button btn1 = new Button("결재");
		Button btn2 = new Button("반려");
		
		btn1.setSize(100, 50);
		btn1.setLocation(40, 75);
		btn2.setSize(100, 50);
		btn2.setLocation(160, 75);
		
		
		frame.add(btn1); frame.add(btn2);
		frame.setVisible(true);
		frame.setResizable(true);
	}

}
