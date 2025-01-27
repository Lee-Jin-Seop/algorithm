class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int tLength = t.length();
        int pLength = p.length();
        
        for (int offset = 0; offset <= tLength - pLength; offset++) {
            String subString = t.substring(offset, offset + pLength);
            if (subString.compareTo(p) <= 0) count++;
        }
        
        return count;
    }
}