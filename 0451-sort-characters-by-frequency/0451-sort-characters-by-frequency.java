import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Step 1: Frequency count
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        // Step 3: Build the result
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int freq = map.get(ch);
            for (int i = 0; i < freq; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
