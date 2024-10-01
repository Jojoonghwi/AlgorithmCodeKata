package 모의고사;
//https://school.programmers.co.kr/learn/courses/30/lessons/42840
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        int answer_supo1 = 0;
        int answer_supo2 = 0;
        int answer_supo3 = 0;
        int[] arr = {0,0,0};

        for(int i=0; i< answers.length; i++) {
            if(answers[i] == supo1[i%supo1.length]) {
                answer_supo1++;
                arr[0] = answer_supo1;
            }

            if(answers[i] == supo2[i%supo2.length]) {
                answer_supo2++;
                arr[1] = answer_supo2;
            }

            if(answers[i] == supo3[i%supo3.length]) {
                answer_supo3++;
                arr[2] = answer_supo3;
            }
        }
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        ArrayList<Integer> answersList = new ArrayList<>();

        if(max == arr[0]) {
            answersList.add(1);
        }
        if(max == arr[1]) {
            answersList.add(2);
        }
        if(max == arr[2]) {
            answersList.add(3);
        }

        answer = new int[answersList.size()];

        for(int i = 0; i < answersList.size(); i++) {
            answer[i] = answersList.get(i);
        }

        return answer;
    }
}
