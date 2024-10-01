package 없는숫자더하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/86051
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a=0;
        for(int i=0; i<10; i++) {
            a=0;
            for(int j=0; j<numbers.length; j++) {
                if(numbers[j] == i) {
                    a=1;
                }
            }
            if(a!=1) {
                answer += i;
            }
        }
        return answer;
    }
}
