/*Vector(int capacity): this constructor indicates developer
can pass capacity value according to his requirement at the time of object creation
*/

import java.util.*;

public class VectorDemo1{
	
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Size of Vector: ");
		int n = xyz.nextInt();
		
		Vector v = new Vector(n);
		int capacity = v.capacity();
		System.out.println("Default Capacity of vector " + capacity);
	}
}

	
	