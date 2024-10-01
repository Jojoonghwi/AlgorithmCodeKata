package 최대공약수와최소공배수;
//https://school.programmers.co.kr/learn/courses/30/lessons/12940
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};

        for(int i=1; i<=n; i++) {
            if(n%i == 0 && m%i==0) {
                answer[0] = i;
            }
        }

        answer[1] = (n*m) / answer[0];

        return answer;
    }
}
