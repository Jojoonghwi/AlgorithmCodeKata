package 명예의전당1;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> listHonor = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            listHonor.add(score[i]);
            Collections.sort(listHonor);
            answer[i] = listHonor.get(0);
            //k > score.length일때 조건
            if (i == score.length - 1) {
                return answer;
            }
        }

        for (int i = k; i < score.length; i++) {
            listHonor.add(score[i]);
            Collections.sort(listHonor);
            //listHonor.get(0) < score[i]여도 뒤에 붙기 때문에 listHonor.get(0) 삭제
            listHonor.remove(0);
            answer[i] = listHonor.get(0);
        }
        return answer;
    }
}