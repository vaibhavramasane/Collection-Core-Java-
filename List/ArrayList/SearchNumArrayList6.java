/*Q6. Write a java program to Check whether a given number exists in an ArrayList.
Explanation:
 You learn:
Linear search logic
Use of flag variable
Comparison using loop
 */
 
import java.util.*;

class SearchNumArrayList6{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		System.out.println("Enter size of ArrayList:");
		int n = xyz.nextInt();
		
		System.out.println("Enter " + n + " Elements");
		for(int i=0; i<n; i++){
			
			int value = xyz.nextInt();
			al.add(value);
			
		}
		//int target = 5;
		System.out.println("Enter a Target: ");
		int target = xyz.nextInt();
		
		boolean found = false;
		for(int i=0; i<al.size(); i++){
			
			if(al.get(i)== target){
				
				found = true;
				break;
				
			}
		}
		if(found) 
			System.out.println("target found");
		
		else
			System.out.println("Target not found");
		
	}
}

				
				
		