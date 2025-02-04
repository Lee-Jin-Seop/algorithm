class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(" "); // 공백은 그대로 유지
            } else {
                char base = (c >= 'a') ? 'a' : 'A'; // 대소문자 기준 문자 설정
                sb.append((char) (base + (c - base + n) % 26)); // 현재 문자를 n만큼 밀고 26으로 나누어 순환하도록 계산
            }
        }
        
        return sb.toString();
    }
}