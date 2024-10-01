package 약수의개수와덧셈;
//https://school.programmers.co.kr/learn/courses/30/lessons/77884
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int num=0;
        for(int i=left; i<(right+1); i++) {
            for(int j=1; j<i+1; j++) {
                if(i%j ==0){
                    ++num;
                }
            }
            if(num %2 ==0) {
                answer += i;
                num =0;
            }

            else {

                answer -= i;
                num =0;
            }

        }
        return answer;
    }
}
