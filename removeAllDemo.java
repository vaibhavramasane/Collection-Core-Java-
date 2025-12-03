/*public abstract boolean removeAll(java.util.Collection<?>): 
this method is used for removing more than one value at time from
collection and if all values removed successfully return true
otherwise false*/

import java.util.*;

class removeAllDemo{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		System.out.println("Before Clear Apply : " + al);
		al.clear();
		System.out.println("After clear apply: " + al);
		
	}
}
