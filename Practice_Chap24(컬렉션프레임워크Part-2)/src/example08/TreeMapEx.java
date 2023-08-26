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
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + " - " + entry.getValue());
		
		System.out.println("===================================================================");
		
		entry = scores.lowerEntry(95);
		System.out.println("95점 바로 아래 점수(95점 미포함) : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.higherEntry(95);
		System.out.println("95점 바로 윗 점수(95점 미포함) : " + entry.getKey() + " - " + entry.getValue());
		
		System.out.println("===================================================================");
		
		entry = scores.floorEntry(95);
		System.out.println("95점 바로 아래 점수(95점 포함) : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.ceilingEntry(95);
		System.out.println("95점 바로 윗 점수(95점 포함) : " + entry.getKey() + " - " + entry.getValue());
		
		System.out.println("===================================================================");
		
//		while(!scores.isEmpty()) {
//			entry = scores.pollFirstEntry();
//			int value = entry.getKey();
//			String str = entry.getValue();
//			System.out.println("키 : " + value + " - " + "값 : " + str);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
		
//		while(!scores.isEmpty()) {
//			entry = scores.pollLastEntry();
//			int value = entry.getKey();
//			String str = entry.getValue();
//			System.out.println("키 : " + value + " - " + "값 : " + str);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
		
		Set<Map.Entry<Integer, String>> entrySet = scores.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> mapentry = iterator.next();
			int value = mapentry.getKey();
			String str = mapentry.getValue();
			System.out.println("키 : " + value + " - " + "값 : " + str);
//			iterator.remove();      //객체삭제하려면 해당코드 꼭 넣어야함
			System.out.println("남은 객체 수 : " + scores.size());
		}
	}

}
