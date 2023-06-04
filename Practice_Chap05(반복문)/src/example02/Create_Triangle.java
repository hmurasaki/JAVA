package example02;

public class Create_Triangle {

	public static void main(String[] args) {
		
//		********
//		*******
//		******
//		*****
//		****
//		***
//		**
//		*
		
		
//		int x = 0;
//		for(int i=0; i<8; i++) {
//			for(int j=1; j<(8-x); j++) {
//				System.out.print("*");
//			}
//			x++;
//			System.out.println(); //줄바꿈
//		}
//	}
		
		//int x = 0;
		for(int i=0; i<8; i++) {
			for(int j=i; j<8; j++) {
				System.out.print("*");
			}
			//x++;
			System.out.println(); //줄바꿈
		}
	}

}
