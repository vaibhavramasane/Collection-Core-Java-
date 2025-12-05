/*
Vector(int capacity,int incrementalCapacity):int capacity--> this parameter decide set the initial capacity
of vector according to user requirement

int IncrementalCapacity: this parameter decide increment capacity or expand memory with specified size after capaccity loss


*/

import java.util.*;

public class VectorIncrementalCap{
	
	public static void main(String x[]){
		
		Vector v = new Vector(5,2);
		int capacity = v.capacity();
		System.out.println("Default capacity of vector " + capacity);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		int size = v.size();
		System.out.println("Current Size of Vector " + size);
		capacity = v.capacity();
		
		System.out.println("Default capacity of vector " + capacity);
	
	
	}
	
}

