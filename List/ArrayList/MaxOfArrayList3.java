/*Q3. Write a program to find the maximum value from an integer ArrayList.
Explanation:
 You will learn:
How to compare elements
Store maximum value manually
Logical thinking without built-in methods
 */
 
import java.util.*;

class MaxOfArrayList3{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
		
		int max= al.get(0);
		for(int i=1; i<al.size(); i++){
			
			if(al.get(i) > max){
				
				max = al.get(i);
				
			}
		}
		System.out.println("Maximum elements in an array: " + max);
	}
}
			
			