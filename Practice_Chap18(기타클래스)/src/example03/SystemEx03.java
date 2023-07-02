package example03;

import java.util.Properties;
import java.util.Set;

public class SystemEx03 {

	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		System.out.println("현재 운영체제 : " + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("사용자 계정 : " + userName);
		
		//Properties클래스는 Map인터페이스 계열의 컬렉션이다.
		//그런데 제네릭타입으로 String,String갖는다. 키도 String , 값도 String이다.
		Properties properties = System.getProperties();
//		System.out.println(properties.toString());         //키와 벨류가 분리안된채로 출력됨
		
		//Map컬렉션에서 키값만 set계열로 가져오는 메서드 = keyset
		Set set = properties.keySet();        //컨+쉬+o	
		
		System.out.println("Key                                          value");
		System.out.println("---------------------------------------------------");
		for(Object objkey : set) {
			String key = (String)objkey;
			String value = System.getProperty(key);    //value값이 나옴
			System.out.println(key + "                                " + value);
		}
		
		
	}

}
