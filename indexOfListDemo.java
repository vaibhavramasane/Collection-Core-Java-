/*public abstract int indexOf(java.lang.Object): this method is used for search
elements in collection using value and if value found its index 
or first Occurrence index and if value not found return -1 */

import java.util.*;

public class indexOfListDemo{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		int index = al.indexOf(30);
		if(index!=-1){
			
			
			System.out.println("Value Found at index : " + index);
			
		}else{
			
			System.out.println("Value not found");
			
		}
	}
	
}