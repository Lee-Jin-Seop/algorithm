class Solution {
    public int solution(int n, int[][] computers) {
        int networkCount = 0;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, n, computers, visited);
                networkCount++;
            }
        }
        
        return networkCount;
    }
    
    private void dfs(int currentNode, int n, int[][] computers, boolean[] visited) {
        visited[currentNode] = true;
        for (int i = 0; i < n; i++) {
            if (computers[currentNode][i] == 1 && !visited[i]) {
                dfs(i, n, computers, visited);
            }
        }
    }
}