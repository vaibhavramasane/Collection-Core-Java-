/*Q1. Write a Java program to store 5 integers in a Vector.
 Print only the even numbers using a loop.
Vector creation
Adding elements
Logical condition: num % 2 == 0 */
//  WAP to store 5 integer values in Collection or Vector and calculate its sum.
import java.util.*;=

class EvenVectorDemo{
	
	public static void main(String x[]){
		
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		
		Iterator i = v.iterator();
		int sum = 0;
		while(i.hasNext()){
			
			Object obj = i.next();
			
			String str = (int)obj % 2==0 ? "Even" : "Odd";
			System.out.println(str);
				
		}
		//System.out.println("sum of all vallues " +sum);
		
	}
}
