/*Q2. Create an ArrayList of integers and calculate the sum of all elements.

	Explanation:
	 This question practices:
Iterating over ArrayList
Performing arithmetic operations
Using get(index) method
*/
import java.util.ArrayList;

class SumOfArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i); 
        }

        System.out.println("Sum of elements: " + sum);
    }
}
