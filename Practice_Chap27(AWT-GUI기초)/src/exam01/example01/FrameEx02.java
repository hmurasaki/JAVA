package exam01.example01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameEx02 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Center");
		
		frame.setSize(300, 200);
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//화면의 크기를 구하는 방법
		Dimension screenSize = toolkit.getScreenSize();
		
		System.out.println(screenSize.toString());      //width=1440,height=900
		
		//화면 크기의 절반 값에서 프레임의 크기의 절반값을 뺀 위치로 해야
		//화면 가운데에 위치하게 된다. ((screenSize.---/2)-100)
		frame.setLocation((screenSize.width/2)-150, (screenSize.height/2)-100);
		
		frame.setVisible(true);
		
		
		
	}

}
