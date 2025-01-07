class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[] dp = new int[n];
        
        // dp 테이블 갱신
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0) {
                    dp[j] += triangle[i][j];
                } else {
                    dp[j] = Math.max(dp[j - 1], dp[j]) + triangle[i][j];
                }
            }
        }
        
        // 최댓값 반환
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}