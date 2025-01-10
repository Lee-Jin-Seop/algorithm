import java.util.*;

class Solution {
    private int[] dr = {-1, 1, 0, 0};
    private int[] dc = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        return go(maps);
    }
    
    private int go(int[][] maps) {
        Queue<int[]> bfsQ = new ArrayDeque<>();
        bfsQ.offer(new int[] {0, 0});
        
        while (!bfsQ.isEmpty()) {
            int[] cur = bfsQ.poll();
            
            if (cur[0] == maps.length - 1 && cur[1] == maps[0].length - 1) {
                return maps[maps.length - 1][maps[0].length - 1];
            }
            
            for (int dir = 0; dir < 4; dir++) {
                int nr = cur[0] + dr[dir];
                int nc = cur[1] + dc[dir];
                if (canGo(nr, nc, maps)) {
                    bfsQ.offer(new int[] {nr, nc});
                    maps[nr][nc] = maps[cur[0]][cur[1]] + 1;
                }
            }
        }
        
        return -1;
    }
    
    private boolean canGo(int r, int c, int[][] maps) {
        return (0 <= r && r < maps.length && 0 <= c && c < maps[0].length)
            && maps[r][c] == 1;
    }
}