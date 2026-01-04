//MaxConsecutiveOneArrList.java
import java.util.*;

class MaxConsecutiveOneArrList{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		ArrayList <Integer> al = new ArrayList<>();
		
		System.out.println("Enter size of ArrayList:");
		int n = xyz.nextInt();
		
		if (n <= 0) {
            System.out.println("ArrayList cannot have zero or negative size.");
            return;
        }
        
        // Input values with validation for 0 or 1 only
        System.out.println("Enter " + n + " Elements (only 0 or 1):");
        for (int i = 0; i < n; i++) {
            int value;
            // Validate input to ensure only 0 or 1 is entered
            while (true) {
                value = xyz.nextInt();
                if (value == 0 || value == 1) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter 0 or 1.");
                }
            }
            al.add(value);
        }
		System.out.println("Max One's Of Consecutive Numbers: ");
		int maxcount=0;
		int currcount=0;
		for(int num : al){
			
			if(num==1){
				
				currcount++;
				
			}else{
				
				maxcount = Math.max(maxcount,currcount);
				currcount=0;
				
			}
		}
		maxcount= Math.max(maxcount,currcount);
		System.out.println(maxcount);
		
	}
}
