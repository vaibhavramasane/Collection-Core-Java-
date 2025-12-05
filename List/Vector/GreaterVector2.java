/*Q2. Create a Vector of integers.
Store 10 numbers and count how many numbers are greater than 50.
Iteration
Logical comparison: num > 50
Counter concept
 */
 
 import java.util.*;
 
 class GreaterVector2{
	 
	public static void main(String x[]){
		
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(10);
		v.add(90);
		v.add(60);
		v.add(70);
		v.add(80);
		
		Iterator i = v.iterator();
		int sum =0;
		
		while(i.hasNext()){
			Object obj = i.next();
			if((int)obj > 50){
				
				System.out.println(obj);
				
			}
		}
	}
}
	
