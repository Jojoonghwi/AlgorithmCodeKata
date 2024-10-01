package 로또의최고순위와최저순위;
//https://school.programmers.co.kr/learn/courses/30/lessons/77484
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7,7};
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i]==0) {
                answer[0]--;
                continue;
            }
            else {
                for(int j=0; j<win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]) {
                        answer[0]--;
                        answer[1]--;
                    }
                }
            }
        }
        if(answer[0]==7) {
            answer[0] = 6;
        }
        if(answer[1]==7) {
            answer[1] = 6;
        }
        return answer;
    }
}
