//  WAP to store 5 integer values in Collection or Vector and calculate its sum.
import java.util.*;

class VectorSum{
	
	public static void main(String x[]){
		
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		Iterator i = v.iterator();
		int sum =0;
		while(i.hasNext()){
			
			Object obj = i.next();
			
			sum  +=(int)obj;
		}
		System.out.println("sum of all vallues " +sum);
		
	}
}
