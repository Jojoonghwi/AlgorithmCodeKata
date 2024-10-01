package 햄버거만들기;
//https://school.programmers.co.kr/learn/courses/30/lessons/133502
import java.util.Arrays;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        String hambuger = Arrays.toString(ingredient).replace(",", "").replace(" ", "").replace("[", "").replace("]", "");
        int length = hambuger.length();

        while(true) {
            hambuger = hambuger.replace("1231", "");
            if(!hambuger.contains("1231")) {
                break;
            }
        }

        answer = (length - hambuger.length())/4;

        return answer;
    }
}
