package 둘만의암호;
//https://school.programmers.co.kr/learn/courses/30/lessons/155652
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char char_s = s.charAt(i);
            for (int j = 0; j < index; j++) {
                char_s = (char) (char_s + 1);
                if (skip.contains(char_s + "")) {
                    j--;
                }
                if ((int) char_s > 122) {
                    char_s -= 26;
                    if (skip.contains(char_s + "")) {
                        j--;
                    }
                }
            }
            answer+=char_s;
        }
        return answer;
    }
}
