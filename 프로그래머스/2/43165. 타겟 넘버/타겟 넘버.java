class Solution {
    public int solution(int[] numbers, int target) {
        return count(numbers, 0, 0, target);
    }
    
    int count(int[] numbers, int idx, int acc, int target) {
        if (idx == numbers.length) {
            if (acc == target) {
                return 1;
            }
            return 0;
        }
        
        return count(numbers, idx + 1, acc - numbers[idx], target)
            + count(numbers, idx + 1, acc + numbers[idx], target);
    }
}