package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSortEx {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(100);
		scores.add(-50);
		
		//기본 - 오름차순
		System.out.println("기본 오름차순 결과 : " + scores);   //오름차순정렬으로 나온다 (기본)
		System.out.println("객체 수 : " + scores.size());
		
		System.out.println("-------------------------------------------");
		
		//내침차순 - NavigableSet
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println("내림차순 결과 : " + descendingSet);
		System.out.println("객체 수 : " + descendingSet.size());
		
		System.out.println("-------------------------------------------");
		
		//오름차순으로 변경
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		System.out.println("다시 오름차순 결과 : " + ascendingSet);
		System.out.println("객체 수 : " + ascendingSet.size());
		
	}

}
