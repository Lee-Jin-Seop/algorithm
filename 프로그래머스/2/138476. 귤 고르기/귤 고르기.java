import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : tangerine) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        
        int count = 0;
        for (int e : list) {
            if (k <= 0) break;
            k -= e;
            count++;
        }
        return count;
    }
}