import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for (char e : String.valueOf(n).toCharArray()) {
            answer += e - '0';
        }

        return answer;
    }
}