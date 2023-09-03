package exam01.example05;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Label");
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();      //디멘전 구해서 스크린사이즈 구하려함
		Dimension screenSize = toolkit.getScreenSize();     //화면크기
		
		frame.setLocation((screenSize.width/2)-150, (screenSize.height/2)-100);
		
		//Label생성 (텍스트를 표시함)
		Label id = new Label("ID : ");
		id.setBounds(50, 50, 30, 10);
		Label pwd = new Label("Password : ");
		pwd.setBounds(50, 65, 100, 10);
		
		frame.add(id);
		frame.add(pwd);
		frame.setVisible(true);
		frame.setResizable(true);
	}

}
