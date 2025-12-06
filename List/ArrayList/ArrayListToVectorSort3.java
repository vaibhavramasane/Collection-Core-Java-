/*Q3. Take an ArrayList of integers, convert it to a Vector,
 then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
 */
 
import java.util.*;

class ArrayListToVectorSort3{
	
	public static void main(String x[]){
		
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(9);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(7);
		al.add(5);
		
		System.out.println(al);
		
		
		
		Vector<Integer> v = new Vector<>(al);
		
		Iterator<Integer> it = v.iterator();
		
		for(int i=0; i<al.size(); i++){
			
			for(int j=i+1; j<al.size(); j++){
				
				if(al.get(i) > al.get(j)){ // Ascending order
					
					int temp = al.get(j);
					al.set(j,al.get(i));
					al.set(i, temp);
					
				}
				
				
			}
		}
		System.out.println("Desecnding Order: " + al);
		
		
	}
}
		
		
