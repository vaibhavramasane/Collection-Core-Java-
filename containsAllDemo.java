/*public abstract boolean containsAll(java.util.Collection<?>):
 this method searches for more  than one value present in the 
 collection or not if present return true otherwise return false.
 */
 
 import java.util.*;
 
 class containsAllDemo{
	 
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		Collection<Integer> c = new ArrayList<>();
		c.add(100);
		c.add(300);
		
		boolean b = al.containsAll(c);
		if(b){
			
			System.out.println("Value Found");
			
		}else{
			
			System.out.println("Value not found");
			
		}
	}
	
 }
 