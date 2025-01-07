import java.util.*;

class Solution {
    private ArrayList<Integer>[] adjList;
    private int[] distance;
    
    public int solution(int n, int[][] edge) {
        init(n, edge);
        calcDistance();
        return getMaxDistance();
    }
    
    private void init(int n, int[][] edge) {
        // 인접 리스트 초기화
        adjList = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }
        
        // 정점 초기화
        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];
            adjList[a].add(b);
            adjList[b].add(a);
        }
        
        // 거리 배열 초기화
        distance = new int[n + 1];
        Arrays.fill(distance, -1);
    }
    
    private void calcDistance() {
        Queue<Integer> bfsQ = new ArrayDeque<>();
        bfsQ.offer(1);
        distance[1] = 0;
        
        while (!bfsQ.isEmpty()) {
            int cur = bfsQ.poll();
            for (int e : adjList[cur]) {
                if (distance[e] == -1) {
                    bfsQ.offer(e);
                    distance[e] = distance[cur] + 1;
                }
            }
        }
    }
    
    private int getMaxDistance() {
        int max = 0;
        int cnt = 0;
        for (int i = 2; i < distance.length; i++) {
            if (distance[i] > max) {
                max = distance[i];
                cnt = 1;
            } else if (distance[i] == max) {
                cnt++;
            }
        }
        return cnt;
    }
}