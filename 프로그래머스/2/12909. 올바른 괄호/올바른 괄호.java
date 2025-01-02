class Solution {
    boolean solution(String s) {
        char[] arr = s.toCharArray();
        int top = 0;
        
        for (char c : arr) {
            if (c == '(') {
                top++;
            } else {
                if (top == 0) {
                    return false;
                }
                top--;
            }
        }
        
        return top == 0;
    }
}