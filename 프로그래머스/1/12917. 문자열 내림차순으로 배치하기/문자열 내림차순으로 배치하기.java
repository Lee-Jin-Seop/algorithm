import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        return new StringBuilder(new String(str)).reverse().toString();
    }
}