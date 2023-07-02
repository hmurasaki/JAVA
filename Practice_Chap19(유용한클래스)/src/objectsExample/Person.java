package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class Person {

	int age;
	String name;
	int[] arr;
	
	public Person(int age, String name, int[] arr) {
		super();
		this.age = age;
		this.name = name;
		this.arr = arr;
	}
	
	@Override
	public int hashCode() {
		//하위호환은 아래코드로 짜야함 (JDK1.8이하)
//		return this.age + this.name.hashCode() + Arrays.toString(this.arr).hashCode();
		
		//JDK1.8이상은 아래코드로 (상위호환)(신규개발시 아래와같이 작성을하면 해쉬코드얻기가 상당히 수월하다)
		return Objects.hash(this.age, this.name, Arrays.toString(this.arr));            //배열이든뭐든상관없음 갯수도상관없음
	}
	
	
}
