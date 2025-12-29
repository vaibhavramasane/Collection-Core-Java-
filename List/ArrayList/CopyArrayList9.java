/*Q9. Write a java program to Copy all elements from one integer ArrayList to another.
Explanation:
 This practices:
Working with multiple ArrayList objects
Element-by-element copying
 */
 
import java.util.*;

class CopyArrayList9{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("Enter size of ArrayList: ");
		int n = xyz.nextInt();
		
		System.out.println("Enter " + n + " elements" );
		for(int i=0; i<n; i++){
			
			int value = xyz.nextInt();
			al.add(value);
			
		}
		//
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		for(int val : al){
			
			al2.add(val);
			
		}
		System.out.println("One ArrayList Copy to Another: " + al2);
		
	}
	
}

		
		