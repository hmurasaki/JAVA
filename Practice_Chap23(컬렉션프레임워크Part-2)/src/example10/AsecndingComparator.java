package example10;

import java.util.Comparator;

public class AsecndingComparator implements Comparator<Fruit> {
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		//방법 1
//		if(o1.getPrice() < o2.getPrice())
//			return -1;
//		else if(o1.getPrice() == o2.getPrice())
//			return 0;
//		else
//			return 1;
		
		//방법 2
		return o1.getPrice() - o2.getPrice();
	}

}
