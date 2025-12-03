/*public abstract E set(int, E): this method is used to replace the value in collection by using 
a specified index */
import java.util.*;

public class SetDemo{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("Replaced Element: " + al.set(1,3000));
		System.out.println("Updated ArrayList: " + al);
		
	}
	
}