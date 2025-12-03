/*public abstract void add(int, E): this method can add value on specified index
in collection and move value of that index at upper side by 
index shifting */

import java.util.*;
public class AddingindexDemo{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
	
	
		System.out.println("Before add : " + al);
		al.add(2,200);
		System.out.println("After add : " + al);
		
	}
}

		
		