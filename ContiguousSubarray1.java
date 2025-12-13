/* 1. Longest Subarray With Sum ≤ K
Description:
Given an integer list nums and integer k, return the maximum length of a contiguous subarray whose sum is ≤ k.
Example:
Input: nums=[2,3,1,2,4], k=7
Output: 3
Explanation: [3,1,2] has sum 6 ≤ 7.
*/
			
import java.util.*;

class ContiguousSubarray1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 4));
        int k = 7;
        
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < al.size(); right++) {
            sum += al.get(right);

            while (sum > k) {
                sum -= al.get(left);
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        System.out.println("The maximum length of the subarray with sum ≤ " + k + " is: " + maxLength);
    }
}
