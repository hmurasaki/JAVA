package example01;


//설계도, 붕어빵틀을 만드는 작업
public class FieldInit {
	
	//(아래)기본형 변수
	byte byteField;         //1byte
	short shortField;       //2byte
	int intField;           //4byte(디폴트 타입)
	long longField;			//8byte
	
	boolean boolField;      //1
	char charField;         //2
	
	float floatField;       //4
	double doubleField;     //8
	
	//(아래)참조형 변수 
	int[] arrField;         //4
	String strField;        //4
	
	//annotation : 컴파일러에게 강한 컴파일을 요구하는 것.
	//toString() : 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나, 원하는 포맷으로 멤버변수들을 출력하고자 할 때 사용을 많이 함.
	@Override
	public String toString() {
		
		String str = "byteField : " + byteField + "\t" + "shortField : " + shortField + "\t" +
					"intField : " + intField + "\t" + "boolField : " + boolField + "\t" +
					"strField : " + strField;

		return str;
		
//		return super.toString(); //this : 객체 자기자신의 주소 / super : 조상객체의 주소
	}
	
	
}
