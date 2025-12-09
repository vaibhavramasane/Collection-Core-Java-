/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but 
avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
 */

import java.util.*;

class MergeArrayList2 {
    public static void main(String x[]) {
        ArrayList<Integer> A1 = new ArrayList<>();
        A1.add(10);
        A1.add(20);
        A1.add(30);
        A1.add(40);
        System.out.println("First ArrayList: " + A1);

        ArrayList<Integer> A2 = new ArrayList<>();
        A2.add(40);
        A2.add(50);
        A2.add(60);
        A2.add(70);
        System.out.println("Second ArrayList: " + A2);

        ArrayList<Integer> mergedList = new ArrayList<>(A1);

        for (Integer num : A2) {
            if (!mergedList.contains(num)) {
                mergedList.add(num);
            }
        }

        System.out.println("Merged ArrayList without duplicates: " + mergedList);
    }
}
