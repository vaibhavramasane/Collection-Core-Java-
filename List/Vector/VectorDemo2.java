/*if we use default constructor or parameterrized
Constructor and if cross capacity vector then 
vector allocated memory double than its current capacity */

import java.util.*;

public class VectorDemo2{
	
	public static void main(String x[]){
		
		
		Vector v = new Vector(5);
		int capacity = v.capacity();
		
		System.out.println("Default capacity of vector " + capacity);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		int size = v.size();
		
		System.out.println("Default capacity of vector " + size);
		capacity  = v.capacity();
		System.out.println("Default capcity of vector " +capacity);
	}
	
}