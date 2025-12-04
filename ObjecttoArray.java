/*public abstract java.lang.Object[] toArray(): this method
 is used for convert collection into object array */

import java.util.*;

class ObjecttoArray{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		
		Object obj[] = al.toArray();
		
		System.out.println(obj);
	}
}