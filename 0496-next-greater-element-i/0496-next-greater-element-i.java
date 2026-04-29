import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Process nums2
        for (int i = nums2.length - 1; i >= 0; i--) {
            
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            
            int nextGreater = st.isEmpty() ? -1 : st.peek();
            map.put(nums2[i], nextGreater);
            
            st.push(nums2[i]);
        }
        
        // Step 2: Fill answer for nums1
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }
}