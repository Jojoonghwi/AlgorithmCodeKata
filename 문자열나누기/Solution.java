package 문자열나누기;
//https://school.programmers.co.kr/learn/courses/30/lessons/140108
class Solution {
    public int solution(String s) {
        int answer = 0;
        int[] count = new int[2];
        char target = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (target == s.charAt(i)) {
                count[0]++;
            }
            else {
                count[1]++;
            }

            if (count[0] == count[1]) {
                answer++;
                if(i < s.length()-1) {
                    target = s.charAt(i + 1);
                }

                count = new int[2];
            }
        }

        if ((count[0] != count[1])) {
            return answer+1;
        }

        return answer;
    }
}
