import java.util.*;

class Pair {
    int r, c, time;
    
    Pair(int r, int c, int time) {
        this.r = r;
        this.c = c;
        this.time = time;
    }
}

class Solution {
    private Pair start, end, lever;
    
    // 상, 하, 좌, 우
    private int[] dr = {-1, 1, 0, 0};
    private int[] dc = {0, 0, -1, 1};
    
    public int solution(String[] maps) {
        // 시작 지점, 출구, 레버 위치를 저장
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (maps[i].charAt(j) == 'S') {
                    start = new Pair(i, j, 0);
                } else if (maps[i].charAt(j) == 'E') {
                    end = new Pair(i, j, 0);
                } else if (maps[i].charAt(j) == 'L') {
                    lever = new Pair(i, j, 0);
                }
            }
        }
        
        // 시작 지점에서 레버까지 가는데 필요한 시간
        int leverTime = go(start, lever, maps);
        if (leverTime == -1) {
            return -1;
        }
            
        // 레버에서 출구까지 가는데 필요한 시간
        int escapeTime = go(lever, end, maps);
        if (escapeTime == -1) {
            return -1;
        }
            
        return leverTime + escapeTime;
    }
    
    private int go(Pair src, Pair dst, String[] maps) {
        Queue<Pair> bfsQ = new ArrayDeque<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        
        bfsQ.offer(src);
        visited[src.r][src.c] = true;
        
        while (!bfsQ.isEmpty()) {
            Pair cur = bfsQ.poll();
            
            // 목적지에 도달한 경우
            if (cur.r == dst.r && cur.c == dst.c) {
                return cur.time;
            }
            
            for (int dir = 0; dir < 4; dir++) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (canGo(nr, nc, maps, visited)) {
                    bfsQ.offer(new Pair(nr, nc, cur.time + 1));
                    visited[nr][nc] = true;
                }
            }
        }
        
        // 목적지에 갈 수 없는 경우
        return -1;
    }
    
    private boolean canGo(int r, int c, String[] maps, boolean[][] visited) {
        return (0 <= r && r < maps.length && 0 <= c && c < maps[0].length())
            && !visited[r][c]
            && maps[r].charAt(c) != 'X';
    }
}