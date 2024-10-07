package JadenCase문자열만들기;
//https://school.programmers.co.kr/learn/courses/30/lessons/12951

class Solution {
    public String solution(String s) {
        String answer = "";
        char beforeChar = ' ';
        for(int i = 0; i < s.length(); i++) {
            if(beforeChar == ' ') {
                answer += Character.toUpperCase(s.charAt(i));
            }

            else {
                answer += Character.toLowerCase(s.charAt(i));
            }
            beforeChar = s.charAt(i);
        }
        return answer;
    }
}

