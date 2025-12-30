/*Q5. Store numbers in an ArrayList and count how many are even and how many are odd.
Explanation:
 This helps practice:
Modulus operator %
Condition-based counting
Iteration over collections
 */
import java.util.*;

class CountEvenOddArrayList5{
	
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		System.out.println("Enter size of ArrayList:");
		int n = xyz.nextInt();
		
		System.out.println("Enter " + n + " element " );
		for(int i=0; i<n; i++){
			
			int value = xyz.nextInt();
			al.add(value);
			
		}
		
		int countEven=0;
		int countOdd =0;
		
		for(int num : al){
			
			if(num% 2==0)
				countEven++;
			else
				countOdd++;
				
			
		}
		System.out.println("Even Count : " + countEven);
		System.out.println("odd Count : " + countOdd);
		
		
	}
}

				