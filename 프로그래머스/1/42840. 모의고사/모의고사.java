import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 각 수포자의 정답 패턴
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 각 수포자가 맞힌 문제 개수를 저장하는 배열
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) scores[0]++;
            if (answers[i] == second[i % second.length]) scores[1]++;
            if (answers[i] == third[i % third.length]) scores[2]++;
        }
        
        // scores 배열에서 가장 높은 점수를 찾음
        int maxScore = Arrays.stream(scores).max().getAsInt();
        
        // 최고 점수를 받은 수포자(1~3번)를 리스트에 추가
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) result.add(i + 1);
        }
        
        // 리스트를 배열로 변환 후 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}