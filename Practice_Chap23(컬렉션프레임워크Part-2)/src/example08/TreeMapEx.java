package example08;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(87, "홍길동");
		scores.put(98, "신은혁");
		scores.put(75, "김연아");
		scores.put(95, "손연재");
		scores.put(80, "김삼순");
		
		//map 변수선언
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry(); //왼쪽에서 가장 낮은 값을 가져옴
		System.out.println("가장 낮은 점수 : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lastEntry(); //왼쪽에서 가장 높은 값을 가져옴
		System.out.println("가장 높은 점수 : " + entry.getKey() + " - " + entry.getValue());
		
		System.out.println("---------------------------------------------------");
		
		entry = scores.lowerEntry(95);
		System.out.println("95점 바로 아래 점수(95점 미포함) : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.higherEntry(95);
		System.out.println("95점 바로 위 점수(95점 미포함) : " + entry.getKey() + " - " + entry.getValue());
		
		System.out.println("---------------------------------------------------");
		
		entry = scores.floorEntry(95);
		System.out.println("95점 바로 아래 점수(95점 포함) : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.ceilingEntry(95);
		System.out.println("95점 바로 위 점수(95점 포함) : " + entry.getKey() + " - " + entry.getValue());
		
		System.out.println("---------------------------------------------------");
		
//		while(!scores.isEmpty()) {
//			entry = scores.pollFirstEntry();
//			int value = entry.getKey();
//			String str = entry.getValue();
//			System.out.println("키 값 : " + value + " - 값 : " + str);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
		
//		while(!scores.isEmpty()) {
//			entry = scores.pollLastEntry();
//			int value = entry.getKey();
//			String str = entry.getValue();
//			System.out.println("키 값 : " + value + " - 값 : " + str);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
		
		Set<Map.Entry<Integer, String>> entryset = scores.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = entryset.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> mapentry = iterator.next();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 값 : " + value + " - 값 : " + str);
			iterator.remove();
			System.out.println("남은 객체 수 : " + scores.size());
		}
		
		//keySet()이용해서 출력해보기.
		
	}

}
