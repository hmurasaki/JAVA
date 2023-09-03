package exam01.example11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PanelEx {

	public static void main(String[] args) {
		
		
		Frame frame = new Frame("Panel");
		frame.setBounds(500, 300, 500, 300);
		frame.setLayout(null);
		
		//Panel은 종속적인 컨테이너로써 기본적으로 FlowLayout()를 사용한다.
		//따라서 Panel안에 들어갈 컴포넌트의 위치를 따로 지정을 하지 않아도 된다.
		Panel panel = new Panel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(50, 50, 150, 150);
		
		Button ok = new Button("OK");
		Button cancel = new Button("cancel");
		
		
		//이벤트 처리에서 Button은 이벤트의 근원지이고, ActionListener은 버튼을 리스너(감시)하는 것을 등록 한 후, 버튼이 클릭되었다면
		//아래 actionPerformed()가 실행되는 핸들러이다.
		ok.addActionListener(new ActionListener() {   //Listener 감시자 등록
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK버튼 클릭됨");
			}
		});     
		
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cancel버튼 클릭됨");
			}
		});
		
//		현재 버튼들이 Panel컨테이너에 추가가 되고 있기 때문에 프레임 컨테이너에
//		영향을 받는 것이 아니라 Panel컨테이너의 레이아웃매니저에 영향을 받는다는 사실도 반드시 인지를 해야한다.
		panel.add(ok);
		panel.add(cancel);
		frame.add(panel);
		
		//윈도우이벤트를 사용하기 위해서 매개변수 값으로 윈도우리스너 인터페이스를
		//익명 구현객체로 제공을 하게 되면 아래와 같이 필요없는 메서드들까지 오버라이딩되기때문에
		//new WindowAdapter() 를 사용해서 필요한 것만 쓰자.
/*		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
*/
		//윈도우 이벤트 처리 부분, 매개변수가 윈도우어댑터 클래스이다
		//윈도우어댑터클래스는 윈도우리스너 인터페이스의 추상메서드들을 다 오버라이딩 해둔 클래스이다({}으로만 되어있다)
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("윈도우 이벤트 발생");
				System.exit(0);                     
			}
		});
		
		
		
		
		
		frame.setVisible(true);
	}

}
