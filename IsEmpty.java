//
import java.util.*;

class IsEmpty{
	
	public static void main(String x[]){
		
		ArrayList<Integer> al = new ArrayList<>();
       al.add(10);
		al.add(20);
		boolean b = al.isEmpty();
		if(b){
			System.out.println("Array list is empty");
			
		}else{
			
			System.out.println("Array list is not empty");
			
		}
	}
}
