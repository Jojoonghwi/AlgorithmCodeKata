package Solution;
//https://school.programmers.co.kr/learn/courses/30/lessons/12950
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr2[0].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}
