/*public abstract int lastIndexOf(java.lang.Object): this method 
can search element in collection and return its index of last occurrence
of element and if element not found return -1 */

import java.util.*;

public class ListDemo{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(300);
		al.add(500);
		
		System.out.println("ArrayList : " + al);
		int index = al.lastIndexOf(300);
		if(index!=-1){
			
			System.out.println("Value found at index : " + index);
			
		}else{
			
			System.out.println("value not found: ");
			
		}
	}
	
}
