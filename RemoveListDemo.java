/*public abstract E remove(int): this method can remove the value
from collection using its index and shift value at lower index by 1
 and return delete value otherwise retun null */
 
 import java.util.*;
 
 class RemoveListDemo{
	 
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		System.out.println("Before Remove: " + al);
		al.remove(2);
		
		System.out.println("After Remove: " + al);
		
	}
 }
 