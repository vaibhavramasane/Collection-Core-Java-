/* public abstract boolean addAll(java.util.Collection<? extends E>):
this method is used for adding more than values in collection at time.
*/

import java.util.*;
public class addAllListDemo{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		Collection<Integer> c = new ArrayList<>();
		c.add(500);
		c.add(600);
		c.add(700);
		
		System.out.println("Before ArrayList: " + al);
		boolean b = al.addAll(c);
		System.out.println("After ArrayList: " + al);
		
	}
}

		
		