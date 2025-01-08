class Solution {
    public int solution(int n) {
        int nCount = Integer.bitCount(n); // n의 1의 개수
        int answer = n + 1;
        
        // 다음 큰 숫자를 찾기 위한 반복문
        while (Integer.bitCount(answer) != nCount) {
            answer++;
        }
        
        return answer;
    }
}