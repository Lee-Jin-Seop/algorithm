class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n][m];
        
        // 물에 잠긴 지역을 -1로 변경
        for (int[] puddle : puddles) {
            dp[puddle[1] - 1][puddle[0] - 1] = -1;
        }
        
        dp[0][0] = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 물에 잠긴 지역을 0으로 변경
                if (dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                
                if (i != 0) {
                    dp[i][j] = dp[i - 1][j] % 1_000_000_007;
                }
                
                if (j != 0) {
                    dp[i][j] += dp[i][j - 1] % 1_000_000_007;
                }
            }
        }
        
        return dp[n - 1][m - 1] % 1_000_000_007;
    }
}