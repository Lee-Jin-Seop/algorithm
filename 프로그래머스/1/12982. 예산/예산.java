import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 예산을 최대한 많이 지원하기 위해 신청 금액이 작은 부서부터 지원
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            // 예산이 부족하면 더 이상 지원할 수 없음
            if (budget - d[i] < 0) break;
            
            // 예산이 충분하다면 해당 부서에 지원
            budget -= d[i];
            answer++;
        }
        
        return answer;
    }
}