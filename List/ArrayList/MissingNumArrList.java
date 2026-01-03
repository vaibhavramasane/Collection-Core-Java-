//MissingNumArrList.java

import java.util.*;

class MissingNumArrList{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.println("Enter Size: ");
		int N = xyz.nextInt();
		N++;
		
		System.out.println("Enter " + (N-1) + " elements");
		for(int i=0; i<(N-1); i++){
			
			int value = xyz.nextInt();
			al.add(value);
			
		}
		System.out.println("Missing Number From ArrayList");
		int totalsum = (N * (N +1))/2;
		
		int sum =0;
		for(int i=0; i<al.size(); i++){
			sum += al.get(i);
		}
		int missing =totalsum -sum;
		System.out.println(missing);
	}
}

			
			