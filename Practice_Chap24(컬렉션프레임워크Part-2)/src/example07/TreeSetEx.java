package example07;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//TreeSet은 이진트리를 기반으로 이루어진 컬렉션,Set인터페이스와 SortedSet인터페이스를 구현한 클래스이다.
		TreeSet<Integer> scores = new TreeSet<>();
		
		//객체추가
		scores.add(87); //자동박싱 발생
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		//가장 낮은 점수를 구해보기(이진트리의 가장 왼쪽의 값)
		System.out.println("가장 낮은 점수 : " + scores.first());
		//가장 높은 점수를 구해보기(이진트리의 가장 오른쪽 값)
		System.out.println("가장 높은 점수 : " + scores.last());
		
		System.out.println();
		
		//주어진 객체의 왼쪽(아래)에 있는 점수를 구하기
		score = scores.lower(95);  //95점 왼쪽에있는 점수를 알고싶다. 자신의 점수는 포함하지않음.
		System.out.println("95점 아래 점수 : " + score);     //자신의 점수는 포함하지않음.
		
		score = scores.floor(95);    //자기자신 포함해서 출력
		System.out.println("95점 아래 점수(95점도 포함) : " + score);
		System.out.println("남은 객체 수 : " + scores.size());
		
		System.out.println();
		
		//주어진 객체의 오른쪽(위)에 있는 점수를 구하기
		score = scores.higher(95); 
		System.out.println("95점 위의 점수 : " + score);
		
		score = scores.ceiling(95);  //자기자신 포함해서 출력
		System.out.println("95점 위의 점수(95점도 포함) : " + score);
		System.out.println("남은 객체 수 : " + scores.size());
		
		System.out.println();
		
//		//왼쪽에서부터 가져오기
//		while(!scores.isEmpty()) {
//			score = scores.pollFirst();    //맨 왼쪽 객체부터 가져온다. 단, 가져온 후 treeSet에서 제거한다.
//			System.out.println("가져온 객체 : " + score);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
//		System.out.println();
		
//		//오른쪽에서부터 가져오기
//		while(!scores.isEmpty()) {
//			score = scores.pollLast();    //맨 오른쪽 객체부터 가져온다. 단, 가져온 후 treeSet에서 제거한다.
//			System.out.println("가져온 객체 : " + score);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
//		System.out.println();
			
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();   //pollFirst,Last메서드와 Iterator(반복자)와의 가장 큰 차이점은 객체를 제거하느냐의 차이점이 있다.
			iterator.remove();    //반복자에서는 명시적으로 remove()호출해야 객체가 제거된다.
			System.out.println(value + "남은 객체 수 : " + scores.size());
		}
		
	}

}
