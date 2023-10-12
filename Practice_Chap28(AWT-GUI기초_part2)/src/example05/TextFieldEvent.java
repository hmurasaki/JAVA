package example05;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextFieldEvent extends Frame {
		
		Label lId;
		Label lPwd;
		TextField tfId;
		TextField tfPwd;
		Button ok;
		
		
		public TextFieldEvent(String title) {
			super(title);        //조상클래스인 Frame(String title)을 호출함.
		}
		
		public void textFieldShow() {
			
			this.lId = new Label("ID : " , Label.RIGHT);
			this.lPwd = new Label("Password : " , Label.RIGHT);
			
			this.tfId = new TextField(10);
			this.tfPwd = new TextField(10);
			this.tfPwd.setEchoChar('*');        //비밀번호설정
			
			this.ok = new Button("OK");
			
			this.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			//리스너 등록(감지기 등록)	
			this.tfId.addActionListener(new EventHandler());
			this.tfPwd.addActionListener(new EventHandler());
			this.ok.addActionListener(new EventHandler());
			
			this.setLayout(new FlowLayout());
			this.add(lId);
			this.add(tfId);
			
			this.add(lPwd);
			this.add(tfPwd);
			
			this.add(ok);
			
			this.setSize(450, 80);
			this.setLocation(500, 300);
			this.setVisible(true);
			this.setResizable(false);
			
		}
		
		//내부클래스 작성
		class EventHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인환경 구축
				String id = tfId.getText().trim();        //trim : 공백없애주는것
				String pwd = tfPwd.getText().trim();
				
				//아이디맞는지 확인
				if(!id.equals("spark")) {       //스파크가아니라면...	
					System.out.println("입력하신 ID가 유효하지 않습니다.");
					tfId.requestFocus();      //포커스를 다시 아이디창으로 옮겨주는 것 (아이디 다시 입력할수있도록)
					tfId.selectAll();         //입력한 글자를 전체선택되게끔 함
				}
				else if(!pwd.equals("12345")) {
					System.out.println("입력하신 비밀번호가 유효하지 않습니다.");
					tfPwd.requestFocus();      //포커스를 다시 비밀번호창으로 옮겨주는 것 (비밀번호 다시 입력할수있도록)
					tfPwd.selectAll();         //입력한 글자를 전체선택되게끔 함
				}
				else {
					System.out.println(id + "님, 환영합니다.");
				}

			}
			
		}

}
