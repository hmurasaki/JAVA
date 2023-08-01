package example07;

import java.util.Iterator;
import java.util.TreeSet;

public class TressSetEx {

	public static void main(String[] args) {
		
		//TreeSet : 이진트리 기반으로 이루어진 컬렉션, Set인터페이스와 sortedSet인터페이스를 구현한 클래스이다.
		TreeSet<Integer> scores = new TreeSet<>();
		
		//객체추가
		scores.add(87);    //자동박싱이 이루어짐
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		//가장 낮은 점수를 구해보기 ( 이진트리의 가장 왼쪽의 값 )
		System.out.println("가장 낮은 점수 : " + scores.first());
		//가장 높은 점수를 구해보기 ( 이진트리의 가장 오른쪽의 값 )
		System.out.println("가장 높은 점수 : " + scores.last());
		
		//주어진 객체의 왼쪽에 있는 점수
		score = scores.lower(95);
		System.out.println("95점 아래 점수 : " + score);    //자신의 점수(주어진객체)는 포함하지 않는다.
		
		//주어진 객체의 왼쪽에 있는 점수
		score = scores.floor(95);
		System.out.println("95점 아래 점수 (95점도 포함) : " + score);   //자신의 점수(주어진객체) 까지 포함.
		System.out.println("사이즈 : " + scores.size());
		
		System.out.println("---------------------------------");
		
		//주어진 객체의 오른쪽에 있는 점수
		score = scores.higher(95);
		System.out.println("95점 위의 점수 : " + score);    //자신의 점수(주어진객체)는 포함하지 않는다.
		
		//주어진 객체의 오른쪽에 있는 점수
		score = scores.ceiling(95);
		System.out.println("95점 위의 점수 (95점도 포함) : " + score);   //자신의 점수(주어진객체) 까지 포함.
		System.out.println("사이즈 : " + scores.size());
		
		System.out.println("---------------------------------");
		
		//오름차순
//		while(!scores.isEmpty()) {
//			//맨 왼쪽 객체부터 가져온다. 단, 가져온 후 treeSet에서 제거한다.
//			System.out.println("pollFirst()실행");
//			score = scores.pollFirst();
//			System.out.println("가져온 객체 : " + score);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
		
		System.out.println("---------------------------------");
		
		//내림차순
//		while(!scores.isEmpty()) {
//			//맨 오른쪽 객체부터 가져온다. 단, 가져온 후 treeSet에서 제거한다.   
//			System.out.println("pollLast()실행");
//			score = scores.pollLast();
//			System.out.println("가져온 객체 : " + score);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
		
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			//pollFirst,Last메서드와 Iterator(반복자)의 가장 큰 차이점은 객체를 제거하느냐의 차이점이 있다.
			//반복자(Iterator)에서는 명시적으로 remove()호출해야 객체 제거가 된다.
			int value = iterator.next();
			iterator.remove();
			System.out.println(value + "남은 객체 수 : " + scores.size());
		}
		
	}

}
