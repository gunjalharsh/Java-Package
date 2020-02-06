package Batch2.demo;

import java.util.Comparator;

public  class NameComparator implements Comparator<Demo1> {

	@Override
	public int compare(Demo1 o1, Demo1 o2) {
		
		return o1.productName.compareTo(o2.productName);
		
		
		
	}
}
