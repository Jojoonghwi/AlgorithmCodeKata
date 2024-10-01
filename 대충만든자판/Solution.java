package 대충만든자판;
//https://school.programmers.co.kr/learn/courses/30/lessons/160586
import java.util.Arrays;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] indexes = new int[keymap.length];
        int check = 0;

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if (answer[i] != -1) {
                    for (int k = 0; k < keymap.length; k++) {
                        indexes[k] = keymap[k].indexOf(targets[i].charAt(j)) + 1;
                    }
                    Arrays.sort(indexes);
                    for (int l = 0; l < indexes.length; l++) {
                        if (indexes[l] > 0) {
                            answer[i] += indexes[l];
                            check++;
                            break;
                        }
                    }
                    if (check == 0) {
                        answer[i] = -1;
                    } else {
                        check = 0;
                    }
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
