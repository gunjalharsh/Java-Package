package Batch2.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;


public class ProductDemo {

	public static void main(String[] args) {
	
			Date d1=new Date();

			System.out.println(d1);
			System.out.println("\n");System.out.println("\n");
			
			Demo1 p1=new Demo1(1234,"xdbxc",2300.00,d1);
			Demo1 p2=new Demo1(1235,"qwewe",5300.00,d1);
			Demo1 p3=new Demo1(1237,"retet",7300.00,d1);
			Demo1 p4=new Demo1(1236,"wetw",9300.00,d1);

			
			ArrayList<Demo1> list1=new ArrayList<Demo1>();
			
			list1.add(p1);
			list1.add(p2);
			list1.add(p3);
			list1.add(p4);
			
			System.out.println(list1);
			

				
			for(Demo1 p :list1)
			{
				System.out.println(p);
			}
			System.out.println("\n");
			IdComparator idc =new IdComparator();
			Collections.sort(list1,idc);
			System.out.println("\n");
			System.out.println("*****After Sort*****");
			
			for(Demo1 p:list1)
			{
			System.out.println(p);	
			}
			System.out.println("\n");
			System.out.println("******After Sort reverse Order********");
			
			Collections.sort(list1,Collections.reverseOrder(idc));
			
			for(Demo1 p:list1)
			{
				
				System.out.println(p);
			}
			
	}
	
	

}
