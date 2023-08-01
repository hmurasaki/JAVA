package example10;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class ComparatorEx {

	public static void main(String[] args) {
		
		//생성자에 비교기준을 이미 제시를 함
		TreeSet<Fruit> treeSet = new TreeSet<>(new AsecndingComparator());   //내가 정한 정렬로 하고싶다면 new Asecnding~
		
//		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Comparator<Fruit>() {
//			@Override
//			public int compare(Fruit o1, Fruit o2) {
//				return o1.getPrice() - o2.getPrice();       //올림차순 , >>내림차순 o2.getPrice() - o1.getPrice();
//			}
//		});
		
		
		//비교기준이 없다면 ClassCastException 실행예외가 발생할 수 있다.
		//그렇기때문에 try-catch로 감싸주는게 좋다.
		try {
			treeSet.add(new Fruit("딸기", 4200));
			treeSet.add(new Fruit("포도", 6500));
			treeSet.add(new Fruit("복숭아", 3500));
			treeSet.add(new Fruit("바나나", 3400));
			treeSet.add(new Fruit("자두", 2500));
			treeSet.add(new Fruit("호박", 1000));
		}catch(Exception e) {
			System.out.println("정렬 기준이 없음");
			e.printStackTrace();
		}
		System.out.println("총 객체수 : " + treeSet.size());
		
		System.out.println();
		
		//올림차순 : 14번 비교자에 의해서.
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName() + " : " + fruit.getPrice());
		}
	}

}
