import java.util.*;

class Solution {
    Map<String, Integer> wordToNumber = Map.of(
        "zero", 0,
        "one", 1,
        "two", 2,
        "three", 3,
        "four", 4,
        "five", 5,
        "six", 6,
        "seven", 7,
        "eight", 8,
        "nine", 9
    );
    
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 영단어가 등장하면 'word'에 누적
            if (Character.isAlphabetic(c)) {
                word.append(c);
                
                // 영단어가 완성되면 숫자로 변환하여 결과에 추가
                if (wordToNumber.containsKey(word.toString())) {
                    answer.append(wordToNumber.get(word.toString()));
                    word.setLength(0);
                }
            } else {
                // 숫자 그대로 결과에 추가
                answer.append(c);
            }
        }
        
        return Integer.parseInt(answer.toString());
    }
}