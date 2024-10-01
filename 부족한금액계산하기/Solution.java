package 부족한금액계산하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/82612
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum=0;
        for(int i=1; i<count+1; i++) {
            sum += price*i;
        }

        if(sum > money) {
            return answer = sum-money;
        }
        else {
            return answer = 0;
        }
    }
}
