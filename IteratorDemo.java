/* public abstract java.util.Iterator<E> iterator():
this method is derived from iterable interface and used
 for fetech data from collection
 */
 
 import java.util.*;
 
 class IteratorDemo{
	 
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		
		Iterator i = al.iterator();
		while(i.hasNext()){
			
			Object obj = i.next();
			
			System.out.println(obj);
			
		}
	}
 }
 