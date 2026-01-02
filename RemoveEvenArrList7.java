/*Q7. Write a java program to Remove all even numbers from an integer ArrayList.
Explanation:
 This teaches:
Removing elements using remove(index)
Handling shifting of elements after removal
Reverse loop concept
 */

import java.util.*;

public class RemoveEvenArrList7 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter size of List : ");
        int n = xyz.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int num = xyz.nextInt();
            al.add(num);
        }

        for (int i = al.size() - 1; i >= 0; i--) {
            if (al.get(i) % 2 == 0) {
                al.remove(i);
            }
        }

        System.out.println("Updated ArrayList (after removing even numbers): " + al);
  
    }
}
