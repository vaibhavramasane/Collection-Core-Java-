/*public abstract boolean remove(java.lang.Object): 
this method is used for removing elements from collection and
if elements is removed return true otherwise false */

import java.util.*;

class RemoveDemo{
	
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		 boolean b = al.remove(Integer.valueOf(300)); // Pass Integer object to remove
        
		if(b){
			
			System.out.println("Elements removed");
			
		}else{
			
			System.out.println("Some problem is there");
			
		}
	}
}
