/*Q4. Take an integer array with repeated values. Store it in an ArrayList 
and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
 */
 
import java.util.*;

class UniqueArrayList4 {
    public static void main(String x[]) {
        int arr[] = {1, 1, 2, 2, 3};
        
        ArrayList<Integer> al = new ArrayList<>();
        for (int a : arr) {
            al.add(a);
        }
        
        ArrayList<Integer> AnotherAList = new ArrayList<>();
        
        for (int i = 0; i < al.size(); i++) {
            if (AnotherAList.contains(al.get(i))) {
				
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < al.size(); j++) {
				
                if (al.get(i) == al.get(j)) {
                    count++;
                    AnotherAList.add(al.get(j));
                }
            }
            
            System.out.println("Frequency of " + al.get(i) + " is " + count);
            AnotherAList.add(al.get(i));
        }
    }
}
