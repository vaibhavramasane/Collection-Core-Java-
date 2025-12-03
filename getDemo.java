/* public abstract E get(int): this method is used to return data from
collection using its index and if the index is not found generate 
indexNotFoundException at runtime  */

import java.util.*;

public class getDemo{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		Object obj = al.get(1);
		
		System.out.println(obj);
		
		
	}
}