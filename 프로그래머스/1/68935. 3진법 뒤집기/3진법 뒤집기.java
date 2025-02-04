class Solution {
    public int solution(int n) {
        // 10진수를 3진수 문자열로 변환
        String ternary = Integer.toString(n, 3);
        
        // 3진수 문자열 뒤집기
        String reversed = new StringBuilder(ternary).reverse().toString();
        
        // 뒤집은 3진수 문자열을 10진수로 반환
        return Integer.parseInt(reversed, 3);
    }
}