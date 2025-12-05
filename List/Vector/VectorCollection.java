/* Vector(Collection) : this constructor can copy data from 
another collection and store in vector */
import java.util.*;

class VectorCollection{
	
	public static void main(String x[]){
		
		Collection c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		Vector v = new Vector(c);
		
		System.out.println(v);
		
	}
	
}
