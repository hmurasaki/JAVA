package example12;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicEx extends Frame implements MouseMotionListener {
	
	int x = 0;
	int y = 0;
	
	
	
	//필드로 image객체와 Graphics객체를 선언했다
	Image img = null;
	Graphics gImg = null;
	
	public GraphicEx(String title) {
		super(title);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);

		//Image와 Image의 Graphics를 멤버변수로 정의하고, 생성자에서 createImage()를 통해서
		//Frame과 같은 크기의 Image를 생성하고, 생성된 Image에서 getGraphics()를 호출하여
		//Image에 대한 Graphics객체를 얻었다. 이렇게 해서 얻어진 Graphics에 drawString()를 호출해서
		//작업한 내용은 Image에 그려지게 한다.
		
		//프레임과 똑같은 크기의 이미지를 생성하고 이미지객체에 그림을 그리게끔 만든다
		this.img = this.createImage(500, 500);     
		this.gImg = img.getGraphics();
		this.gImg.drawString("왼쪽 버튼을 누른 채로 마우스를 움직여 보세요.", 10, 50);
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		if(this.img != null) {
			
			//가상화면에 그려진 그림을 Frame에 복사하고 있는 내용이다.
			//여기서 알아야하는 내용은
			//이 부분이 Image에 그려진 내용을 계속 복사를 한다 (this(프레임)에)
			//여기서 ImageObserver를 this로 설정을 해주는데 ImageObserver인터페이스는
			//모든 컴포넌트 클래스가 구현한 인터페이스이다.
			//이미지가 로딩되는데 시간이 걸리기 때문에 로딩이 진행되고 있는 상태를
			//복사될대상인 frame한테 알려줘야하는데 그 대상이 소스에서는 this(프레임).
			//로딩되는 상태에 따라 화면에 다시그려줘야 할 필요가 있다.
			System.out.println(Thread.currentThread().getName());
			System.out.println("페인트");
			g.drawImage(img, 0, 0, this);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {   
			this.x = e.getX();
			this.y = e.getY();
			this.gImg.drawString("*", this.x, this.y);
			repaint();       
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	
	
	

}
