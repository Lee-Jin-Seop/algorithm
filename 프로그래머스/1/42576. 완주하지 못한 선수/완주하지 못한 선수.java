import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for (String name : completion) {
            int v = map.get(name) - 1;
            map.put(name, v);
            if (v == 0) map.remove(name);
        }
        
        return map.keySet().iterator().next();
    }
}