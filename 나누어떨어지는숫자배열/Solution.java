package 나누어떨어지는숫자배열;
//https://school.programmers.co.kr/learn/courses/30/lessons/12910
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int j=0;
        int k=0;
        for(int i=0; i<arr.length; i++) {
            if((arr[i] % divisor) == 0) {
                ++j;
            }
        }

        if(j==0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[j];

        for(int i=0; i<arr.length; i++) {
            if((arr[i] % divisor) == 0) {
                answer[k] = arr[i];
                ++k;
            }
        }

        Arrays.sort(answer);
        return answer;
    }
}
