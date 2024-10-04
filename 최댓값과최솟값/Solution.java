package 최댓값과최솟값;
//https://school.programmers.co.kr/learn/courses/30/lessons/12939
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        //띄어쓰기 기준으로 분리
        String[] arrS = s.split(" ");
        //String 배열 Int배열로 변경
        int [ ] arrInt = Arrays.stream(arrS).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arrInt);

        return answer = arrInt[0] + " " + arrInt[arrInt.length - 1];
    }
}