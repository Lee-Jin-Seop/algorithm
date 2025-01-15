class Solution {
    public int solution(long num) {
        for (int time = 0; time <= 500; time++) {
            if (num == 1) return time;
            if (num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
        }
        
        return -1;
    }
}