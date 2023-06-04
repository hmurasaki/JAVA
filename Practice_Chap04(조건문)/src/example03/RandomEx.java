package example03;

public class RandomEx {

	public static void main(String[] args) {
		
		//Math.random()의 값은 0.00000~ 0.99999사이의 값을 발생시킴.
		//System.out.println(Math.random());
		
		//주사위 눈을 랜덤으로 발생시켜보자.
		int num = (int)(Math.random()*6) + 1; //+1을하면 1~6까지의 범위의 수를 발생시키는 식이된다.
		System.out.println(num);
		
		if(num == 1) {
			System.out.println("1이 나왔네요!");
		}
		else if(num == 2) {
			System.out.println("2가 나왔네요!");
		}
		else if(num == 3) {
			System.out.println("3이 나왔네요!");
		}
		else if(num == 4) {
			System.out.println("4가 나왔네요!");
		}
		else if(num == 5) {
			System.out.println("5가 나왔네요!");
		}
		else {
			System.out.println("6이 나왔네요!");
		}
		
//		//위의 if문을 switch문으로 바꿔보자.
//		int num = (int)(Math.random()*6) + 1; //+1을하면 1~6까지의 범위의 수를 발생시키는 식이된다.
//		System.out.println(num);
//		
//		switch(num) {
//		case 6 :
//			System.out.println("6 입니다.");
//			break;
//		case 5 :
//			System.out.println("5 입니다.");
//			break;
//		case 4 :
//			System.out.println("4 입니다.");
//			break;
//		case 3 :
//			System.out.println("3 입니다.");
//			break;
//		case 2 :
//			System.out.println("2 입니다.");
//			break;
//		case 1 :
//			System.out.println("1 입니다.");
//			break;
//	default :
//		System.out.println("1 이하 입니다.");
//	}
		
		
		
	}

}
