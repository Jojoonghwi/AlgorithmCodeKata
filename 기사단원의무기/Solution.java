package 기사단원의무기;
//https://school.programmers.co.kr/learn/courses/30/lessons/136798
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] yaksu = new int[number];
        for (int i = 1; i < number+1; i++) {
            yaksu[i-1]++;
            int half = i/2;
            for (int j = 1; j < half+1; j++) {
                if(i%j==0){
                    yaksu[i-1]++;
                    if(yaksu[i-1] > limit){
                        yaksu[i-1] = power;
                        break;
                    }
                }
            }
            answer += yaksu[i-1];
        }

        return answer;
    }
}
