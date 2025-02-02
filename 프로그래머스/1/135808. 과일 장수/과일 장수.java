import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        // 점수가 높은 사과부터 상자에 담아 최대 이익을 얻는다
        int profit = 0;
        for (int i = score.length - 1; i >= m - 1; i -= m) {
            profit += score[i - m + 1] * m;
        }
        
        return profit;
    }
}