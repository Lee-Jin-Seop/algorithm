class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while (!s.equals("1")) {
            int beforeLength = s.length();
            
            s = s.replace("0", ""); // 0 제거
            answer[1] += beforeLength - s.length(); // 제거한 0의 개수 카운트
            
            s = Integer.toBinaryString(s.length()); // 길이를 이진수로 변환
            answer[0]++;
        }
        
        return answer;
    }
}