/*Q6. Create a Vector with repeated integers.
Remove duplicates without disturbing the original order.
What you practice:
Checking previous occurrences
Creating a new Vector for results
Order-preserving logic
 */
 
import java.util.*;
class RemoveDuplicatesVector6{
	
	public static void main(String x[]){
		
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(5);
		v.add(6);
		v.add(6);
		v.add(51);
		v.add(52);
		v.add(51);
		v.add(10);
		v.add(10);
		v.add(1);
		
		
		LinkedHashSet<Integer> li = new LinkedHashSet<>(v);
		
		for(Object obj : li){
			
			System.out.println(obj);
			
		}
	}
}

		
		
		
		

