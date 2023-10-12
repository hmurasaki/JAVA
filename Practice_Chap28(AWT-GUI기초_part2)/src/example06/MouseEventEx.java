package example06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MouseEventEx extends Frame {
	
	private Label location;
	
	public MouseEventEx(String title) {
		super(title);
	}
	
	public void MouseShow() {
		//Frame에 대한 설정
		this.setSize(300, 200);
		this.setLocation(500, 300);
		
		//Label에 대한 설정
		this.location = new Label("");
		this.location.setBounds(50, 50, 200, 20);
		this.location.setBackground(Color.YELLOW);     //Label배경색 설정
		this.add(location);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//이벤트 리스너 등록
		this.addMouseListener(new EventHandler());        //프레임에대한 마우스리스너를 등록
		this.addMouseMotionListener(new EventHandler());
		
		this.setLayout(null);
		this.setVisible(true);
	}
	
	class EventHandler extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
				System.out.println("마우스 클릭 이벤트 처리 스레드 : " + Thread.currentThread().getName());
				System.out.println("좌표값 : " + e.getX() + ", " + e.getY());
			}
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			//콘솔에 표식
			System.out.println("마우스 무브 이벤트 처리 스레드 : " + Thread.currentThread().getName());
			
			//라벨로 표식한다.
			location.setText("Mouse 좌표 : " + e.getX() + ", " + e.getY());
		}
	}

}
