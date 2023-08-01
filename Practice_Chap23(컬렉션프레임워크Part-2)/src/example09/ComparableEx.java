package example09;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		
		TreeSet<Person> treeSet = new TreeSet<>();
		
		//사용자정의클래스를 TreeSet에 저장을 하기 위해서는
		//반드시 Comparable, Comparator 인터페이스를 구현해야함. (오버라이딩(재정의))
		//그 이유는 TreeSet저장되면서 자동 정렬이 이루어지기 때문에 그렇다.
		treeSet.add(new Person("신은혁", 12));
		treeSet.add(new Person("홍길동", 35));
		treeSet.add(new Person("손연재", 23));
		treeSet.add(new Person("김지수", 19));
		treeSet.add(new Person("박연수", 25));
		treeSet.add(new Person("손은정", 21));
		treeSet.add(new Person("손민수", 29));
		treeSet.add(new Person("김춘자", 51));
		treeSet.add(new Person("박길후", 61));
		
		System.out.println("총 객체 수 : " + treeSet.size());
		System.out.println("============================================");
		
		//반복자를 통한 출력
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("이름 : " + person.getName() + " / 나이 : " + person.getAge());
		}
		System.out.println("============================================");
		
		System.out.println("내림차순 정렬");
		NavigableSet<Person> descending = treeSet.descendingSet();
		Iterator<Person> deterator = descending.iterator();
		while(deterator.hasNext()) {
			Person person = deterator.next();
			System.out.println("이름 : " + person.getName() + " / 나이 : " + person.getAge());
		}
	}

}
