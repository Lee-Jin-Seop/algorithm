class Solution {
    public int solution(int[] number) {
        return make(number, 0, 0, 0);
    }
    
    private int make(int[] number, int idx, int cnt, int sum) {
        if (cnt == 3) return sum == 0 ? 1 : 0;
        if (idx == number.length) return 0;
        
        return make(number, idx + 1, cnt, sum) + make(number, idx + 1, cnt + 1, sum + number[idx]);
    }
}