class Solution {
    public int solution(int n) {
        int cnt = 1;
        int sum = 1;
        int i = 1;
        int j = 1;
        while (j < n) {
            if (sum < n) {
                sum += ++j;
            } else if (sum > n) {
                sum -= i++;
            } else {
                sum += ++j;
                cnt++;
            }
        }
        return cnt;
    }
}