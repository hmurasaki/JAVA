package exam01.example02;

import java.awt.Button;
import java.awt.Frame;

public class ButtonEx01 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Button");
		
		frame.setSize(500, 500);
		
		//프레임은 컨테이너지만 기본적인 레이아웃 매니저가 BorderLayout Manager임
		frame.setLayout(null);       //레이아웃매니저 설정 해제 (내가 좌표값을 지정하고 하겠다~)
		
		//버튼 생성
		Button btn1 = new Button("확인");
		Button btn2 = new Button("취소");
		
		//버튼 크기 설정 (프레임안에 들어갈거기 때문에 프레임사이즈에 의해서 크기가 설정이된다)
		btn1.setSize(100, 50);
		btn2.setSize(100, 50);
		btn1.setLocation(110, 50);
		btn2.setLocation(220, 50);
		
		frame.add(btn1);
		frame.add(btn2);
		
		frame.setResizable(true);       //true로 설정시 사용자가 프레임의 크기를 조절 못하게 하는 것이다. (잠금)
		frame.setVisible(true);
		
		
		
		
		
		
//		frame.setBounds(0, 0, 0, 0);
		
		
		
		
		
		
		
		
		
		
	}

}
