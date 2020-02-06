package Batch2.demo;

import java.util.Comparator;

public class IdComparator implements Comparator<Demo1> {

	@Override
	public int compare(Demo1 arg0, Demo1 arg1) {
		
		int result=0;
		
		if(arg0.id>arg1.id)
		{
		result+=1;
		}
		else if(arg0.id<arg1.id)
		{
		result-=1;
		}
		else
			result=0;
		
		return result;
	}

}
