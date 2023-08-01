package example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		//ArrayList는 제네릭타입이다. 그래서 Warning 표시가 뜬다.
		//없애고 싶다면 Quick Access(돋보기)에서 Error입력하고 Preference > Generics 탭의 모든 것을 ignore로 바꾸면 된다.  
		
		ArrayList list = new ArrayList();    //기본적으로 10개의 방을 생성함.
		System.out.println("총 크기 : " + list.size());   //저장된 객체가 하나도 없기 때문에 0을 리턴함.
		
		//객체 추가하기
		list.add("111");      //boolean타입의 add(Object o) > 인덱스 순차적 추가
		list.add("222");
		list.add("333");
		list.add("222");
		
		
		list.add(333);      //인티저객체
		
		System.out.println("총 크기 : " + list.size());
		System.out.println("ArrayList의 주소 : " + list.hashCode());
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//0번째 인덱스에 "333"추가하기
		list.add(0, "333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//앞에서부터 검색하여 "333"을 삭제한다. ( 가까운 것 한 개만 삭제 )
		//객체 삭제하기
		list.remove("333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		System.out.println(list.remove("333"));
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		System.out.println("index = " + list.indexOf("333"));        //"333"이없다면 -1을 리턴
		System.out.println("index = " + list.indexOf(333));        //333이없다면 -1을 리턴
		
		//객체 전부 삭제하기
		
		//방법 1
		//list.clear();
		//System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//방법2
		//아래방법으로 삭제하면 객체가 남는다
		//남는 이유 : 인덱스 0을 삭제할 때, i가 0이니까 당연히 0인덱스에 있는 객체는 삭제 되지만, 이 후 i값이 증가되면서 제대로 삭제가 되지 않는 것.
//		//그러므로 삭제를 시킬려면 항상 뒤에서부터 삭제를 해주는 것이다.
//		for(int i=0; i<list.size(); i++) {
//			list.remove(i);
//			System.out.println("ArrayList에 있는 값 : " + list.toString());
//		}
//		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//방법3
		//아래방법으로 삭제하면 IndexOutOfBoundsException 발생한다.
		//이유 : size값이 4인데, ArrayList 인덱스는 3까지 있으니까 그렇다.
//		for(int i=list.size(); i>=0; i--) {
//			list.remove(i);
//		}
//		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		System.out.println("ArrayList에 있는 값 : " + list.toString());
	}

	
}
