package example07;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextComponentEvent extends Frame {
	
	TextField textField;
	TextArea textArea;
	
	public TextComponentEvent(String title) {
		super(title);
	}
	
	public void textComponentShow() {
		this.textField = new TextField();
		this.textArea = new TextArea();
		
		//프레임은 원래 BorderLayout 이므로 아래와 같이 추가하면 된다.
		this.add(textArea, "Center");
		this.add(textField, "South");
		
		//액션이벤트가 발생되는것은 4가지가 있다.
		//1. 버튼이 클릭되었을 때
		//2. 메뉴를 클릭했을 때
		//3. 텍스트필드에서 엔터키를 눌렀을 때
		//4. 리스트의 아이템 하나를 선택해서 더블클릭 했을 때
		
		this.textField.addActionListener(new ActionListener() {  //텍스트필드에 익명구현객체로 이벤트정의 해보기
			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트필드에서 엔터를 치면 textArea에 입력된 텍스트를 textArea에 추가한다.
				textArea.append(textField.getText() + "\n");
				//텍스트필드의 내용은 지운다.
				textField.setText("");
				textField.requestFocus();
			}
		});     
		//textArea영역의 글자를 편집하지 못하게 만든다.
		this.textArea.setEditable(false);
		
		this.setSize(300, 200);
		this.setLocation(500, 300);
		this.setVisible(true);
		
		//포커스가 실행됨과 동시에 텍스트필드에 위치하도록 설정
		this.textField.requestFocus();
		
//		this.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
		
		//윈도우이벤트를 익명자식객체로 만들고 있다.
		WindowAdapter wAdapter = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		
		this.addWindowListener(wAdapter);
	}
	
	
	
	
	
}
