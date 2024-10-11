package 체육복;
//https://school.programmers.co.kr/learn/courses/30/lessons/42842

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        //배열 정렬 [4, 2], [3, 5]와 같은 경우 정렬 안하면 실패
        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌의 체육복이 있는 학생이 도난 당한 경우 먼저
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -100;
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    lost[j] = -1;
                    answer++;
                    break;
                } else if (reserve[i] - 1 == lost[j]) {
                    lost[j] = -1;
                    answer++;
                    break;
                } else if (reserve[i] + 1 == lost[j]) {
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

