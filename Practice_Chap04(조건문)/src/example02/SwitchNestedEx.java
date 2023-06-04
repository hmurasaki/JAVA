package example02;

public class SwitchNestedEx {

	public static void main(String[] args) {
		
		int number = 9;
		
		//정형화된 값,정해져있는값들에게는 switch문 가독성이 if문에비해
		//좋다.
		switch(number) {
			case 1:
			case 7:
				//중첩 switch문을 활용
				switch(number) {
				 case 1:
					 System.out.println("011이시군요.");
					 break;
				 case 7:
					 System.out.println("017이시군요.");
					 break;
				}
				break;
//			case 6:
//			case 9:
//				switch(number) {
//				 case 6:
//					 System.out.println("016이시군요.");
//					 break;
//				 case 9:
//					 System.out.println("019이시군요.");
//					 break;
//				}
//				break;

				//if else if문으로도 활용할수있다.
			case 6:
			case 9:
				if(number == 6) {
					System.out.println("016이시군요.");
				}
				else if(number == 9) {
						System.out.println("019이시군요.");
				}
				break;
		}
	}
}
