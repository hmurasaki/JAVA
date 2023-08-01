package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSearchEx {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		//알파벳의 유니코드에 따라 이진트리에 각각 좌측부터 저장된다.
//		treeSet.add("apple");
//		treeSet.add("f");
//		treeSet.add("fet");
//		treeSet.add("forever");
//		treeSet.add("description");
//		treeSet.add("ever");
//		treeSet.add("zoo");
//		treeSet.add("guess");
//		treeSet.add("cherry");
//		System.out.println("기본 순차 : " + treeSet);
		treeSet.add("가라");
		treeSet.add("나가");
		treeSet.add("다시는");
		treeSet.add("라");
		treeSet.add("라볶이");
		treeSet.add("마");
		treeSet.add("바");
		treeSet.add("사");
		System.out.println("기본 순차 : " + treeSet);
		
		System.out.println("--------------------------------------------------------------------------");
		
		//범위검색 - 알파벳
//		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
//		System.out.println("[C ~ F] 사이의 단어를 검색 : " + rangeSet);           //f~뒤의것은 안나온다 딱 f 한자리만 허용
		
		System.out.println("--------------------------------------------------------------------------");
		
		//범위검색 - 한글
		NavigableSet<String> rangeSet1 = treeSet.subSet("가", true, "라", true);
		System.out.println("[가 ~ 라] 사이의 단어를 검색 : " + rangeSet1);
		
	}

}
