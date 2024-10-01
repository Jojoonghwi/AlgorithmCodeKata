package 크기가작은부분문자열;
//https://school.programmers.co.kr/learn/courses/30/lessons/147355
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long long_t = Long.parseLong(t);
        long long_p = Long.parseLong(p);

        int p_length = p.length();

        //double ten_multiple = Math.pow(10, p_length);

        // for(int i=0; i<(t.length()-p.length())+1; i++) {
        //     if((long_t % ten_multiple) <= long_p) {
        //         answer++;
        //     }
        //     long_t/=10;
        // }

        for(int i=0; i<(t.length()-p.length()+1); i++) {
            String strSub = t.substring(i, p_length+i);
            if(Long.parseLong(strSub) <= long_p) {
                answer++;
            }
        }
        return answer;
    }
}
