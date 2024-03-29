package example04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		
		//키 객체가 동등객체라면 중복 저장하지 않는다.
		map.put(new Student(1001, "홍길동"), 95);
		map.put(new Student(1001, "홍길동"), 90);
		map.put(new Student(2001, "신은혁"), 100);
		map.put(new Student(3001, "김주성"), 58);
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("홍길동 : " + map.get(new Student(1001, "홍길동")));      //1001, 홍길동, 90 을 가져온다. /중복되지않으므로 후출
		
		Set<Student> ketSet = map.keySet();
		Iterator<Student> keyIterator = ketSet.iterator();
		
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			System.out.println("학번 : " + key.getSno() + " " + "이름 : " + key.getName()
								+ "점수 : " + map.get(new Student(key.getSno(), key.getName()))); 
		}
		
		
		
		
	}

}
