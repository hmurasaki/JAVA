package example08;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSearchEx {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//객체 추가
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("f", 64);
		treeMap.put("descrition", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 100);
		treeMap.put("guess", 80);
		treeMap.put("kdb", 80);
		treeMap.put("banana", 90);
		treeMap.put("cherry", 15);
		
		//범위 검색
		//c~f까지만 검색하기, f이후의 값이 있는건 검색되지않음.
		System.out.println("[C ~ F]사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		Set<Map.Entry<String, Integer>> entryset = rangeMap.entrySet();
		for(Map.Entry<String, Integer> entry : entryset) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + " - 페이지번호 : " + value);
		}
		
		System.out.println();
		for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + " - 페이지번호 : " + value);
		}
		System.out.println(treeMap);
		System.err.println();
		
		//"k"를 포함하고 이후 값들만 가지는 Map.Entry 객체를 얻어내기
		System.out.println("[K 포함 이후 단어 검색]");
		NavigableMap<String, Integer> tailMap = treeMap.tailMap("k", true);
		
		for(Map.Entry<String, Integer> entry : tailMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + " - 페이지번호 : " + value);
		}
		
		System.out.println();
		
		//"g"만 포함하고 그 이전의 값들만 가지는 Map.Entry객체를 얻어내기
		System.out.println("[G 포함 이전 단어 검색]");
		NavigableMap<String, Integer> headMap = treeMap.headMap("g", true);
		
		for(Map.Entry<String, Integer> entry : headMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + " - 페이지번호 : " + value);
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
