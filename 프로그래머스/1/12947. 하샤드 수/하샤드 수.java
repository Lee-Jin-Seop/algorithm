class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for (char e : String.valueOf(x).toCharArray()) {
            sum += e - '0';
        }
        
        return x % sum == 0 ? true : false;
    }
}