// contains : this method is used to search in collection
//means search elements or data in collection if found return 
//true otherwise false

import java.util.*;

class ContainsDemo{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		
		boolean b = al.contains(20);
		
		if(b){
			
			System.out.println("element found");
			
		}
		else{
			
			System.out.println("element not found");
			
		}
		
	}
}
