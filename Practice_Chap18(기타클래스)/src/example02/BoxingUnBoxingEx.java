package example02;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		
		//박싱(Boxing)코드 3종류   > 객체화 시킴
		Integer obj1 = new Integer(100);  //포장
		Integer obj2 = new Integer("100");  // ""를넣어도 숫자로 인식을함
		Integer obj3 = Integer.valueOf(100);
		//자동박싱 (컴파일시에 new Integer(100)이 자동으로 붙음(자동으로바뀜)	
		Integer obj4 = 100;
		
		System.out.println("박싱후");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		//언박싱(UnBoxing)코드    > 객체를 기본값으로 바꾼다
		int value1 = obj1.intValue();   //intvalue 포장지에있는 값을 꺼내는코드
		int value2 = obj2;
		int value3 = obj3;
		int value4 = obj4.intValue();     //intvalue()가 불려지면 객체화가되었다는것
		
		System.out.println("언박싱후");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
