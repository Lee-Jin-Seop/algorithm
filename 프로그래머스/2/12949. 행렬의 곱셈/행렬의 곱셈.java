class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // (n x m) 행렬과 (m x t) 행렬의 곱은 (n x t)가 된다
        int n = arr1.length;
        int m = arr1[0].length;
        int t = arr2[0].length;
        
        int[][] mul = new int[n][t];
        
        // 행렬의 곱셈
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                for (int k = 0; k < m; k++) {
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return mul;
    }
}