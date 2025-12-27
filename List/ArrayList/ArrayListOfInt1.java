/* 
Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
Explanation:
	This helps you understand:
How to declare an ArrayList
How to add elements using add()
How to traverse an ArrayList using for loop
*/

import java.util.*;
class ArrayListOfInt1{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("Elements of Array: ");
		for(int i=0; i<al.size(); i++){
			
			System.out.println(al.get(i));
			
		}
	}
}

			
			