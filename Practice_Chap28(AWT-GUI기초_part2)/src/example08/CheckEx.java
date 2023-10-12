package example08;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;

@SuppressWarnings("serial")
public class CheckEx extends Frame {
	
	CheckboxGroup group;
	Checkbox cb1;
	Checkbox cb2;	
	Checkbox cb3;
	
	//생성자에서 다 만들어지고 있다.
	public CheckEx(String title) {
		super(title);
		
		this.group = new CheckboxGroup();
		
		//아래 세개의 체크박스는 체크박스그룹에 포함되어있으며, 하나의 체크박스만 선택가능.
		//또, 매개값 중 3번째의 true는 실행시에 미리 체크를 하라고 한 것이다.
		this.cb1 = new Checkbox("red", group, true);
		this.cb2 = new Checkbox("green", group, false);
		this.cb3 = new Checkbox("blue", group, false);
		
		//체크박스의 배경색을 CYAN으로 지정함.
		this.cb1.setBackground(Color.CYAN);
		this.cb2.setBackground(Color.CYAN);
		this.cb3.setBackground(Color.CYAN);
		
		//체크박스에 ItemListener를 등록하고있다.
		this.cb1.addItemListener(new EventHandler());
		this.cb2.addItemListener(new EventHandler());
		this.cb3.addItemListener(new EventHandler());
		
		this.setLayout(new FlowLayout());
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		
		//시작시 프레임 색깔을 레드로 지정
		this.setBackground(Color.red);
		this.setSize(500, 300);
		this.setLocation(500, 300);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	//중첩클래스인 이벤트핸들러 클래스는 아이템리스너 인터페이스를 구현하고있다.
	class EventHandler implements ItemListener {
		
		//체크박스의 버튼을 클릭하게되면 아이템스테이트체인지드 메서드가 호출이 된다.
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println("ItemEvent발생함");
			
			//getSource()는 모든 이벤트 클래스의 조상인 javq.util.EventObject클래스에 있는 유일한 메서드 이면서
			//유일하게 모든 이벤트클래스에서 사용할 수 있다.
			//리턴타입이 오브젝트라서 타입변환이 필요하다.
			Checkbox cb = (Checkbox)e.getSource();
			
			String color = cb.getLabel();
			
			if(color.equals("red")) {
				//외부 클래스에 접근하여 배경색을 바꾸고 있다.
				CheckEx.this.setBackground(Color.red);
			}
			else if(color.equals("green")) {
				CheckEx.this.setBackground(Color.green);
			}
			else {
				CheckEx.this.setBackground(Color.blue);
			}
		}
	}
}

