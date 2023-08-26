package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSeachEx {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		//알파벳의 유니코드에 따라 이진트리에 각각 좌측부터 저장이 된다.
		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("fo    rever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println(treeSet);
		
		treeSet.add("가라");
		treeSet.add("나가");
		treeSet.add("다시는");
		treeSet.add("라");
		treeSet.add("마");
		treeSet.add("바");
		treeSet.add("사");
		
		//여기서 헷갈릴 수 있는 c ~ f 사이라는 것은 시작이 c부터 해서 끝이 f부분이지만
		//f한자리는 검색을 해주지만 f포함 2자이상은 검색하지않는다.
		//즉 f 맨앞 한자리만 허용한다.
		//알파벳 서치
		System.out.println("[c ~ f] 사이의 단어를 검색해보기");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		System.out.println(rangeSet);
		
		System.out.println("------------------------------------------------------");
		
		//한글 서치
		System.out.println("[가 ~ 라] 사이의 단어를 검색해보기");
		NavigableSet<String> rangeSet1 = treeSet.subSet("가", true, "라", true);
		System.out.println(rangeSet1);
	}

}
