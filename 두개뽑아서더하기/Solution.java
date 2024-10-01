package 두개뽑아서더하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/68644
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();

        int k = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
                k++;
            }
        }

        Collections.sort(answer);

        for (int i = 0; i < answer.size() - 1; i++) {
            for (int j = i + 1; j < answer.size(); j++) {
                if (answer.get(i).equals(answer.get(j))) {
                    answer.set(j, -1);
                }
            }
        }

        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < answer.size(); i++) {
            if(!answer.get(i).equals(-1)) {
                tmp.add(answer.get(i));
            }
        }

        int[] arr = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            arr[i] = tmp.get(i);
        }
        return arr;
    }
}