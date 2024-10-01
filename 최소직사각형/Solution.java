package 최소직사각형;
//https://school.programmers.co.kr/learn/courses/30/lessons/86491
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] arr_w = {};
        int[] arr_h = {};
        for(int i=0; i<sizes.length/2; i++) {
            arr_w[i] = sizes[i][0];
            arr_h[i] = sizes[0][i];
        }
        return answer;
    }
}
