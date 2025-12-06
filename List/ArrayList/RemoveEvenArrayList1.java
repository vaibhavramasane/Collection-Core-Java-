/*Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer
 */
 
import java.util.*;

class RemoveEvenArrayList1{
	
	public static void main(String x[]){
		int a[] = {1,2,3,4,5,6,7,8};
		
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int n : a){
			al.add(n);
		}
		System.out.println("Before Remove Even Number: " + al);
		
		
		Iterator<Integer> i = al.iterator();
		while(i.hasNext()){
			
			Integer obj = i.next();
			if(obj%2==0){
				
				i.remove();
				
			}
		}
		
		System.out.println("After Remove Even Number: " + al);
		
	}
}

		
		
		