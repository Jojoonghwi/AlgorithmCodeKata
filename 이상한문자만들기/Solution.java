package 이상한문자만들기;

//https://school.programmers.co.kr/learn/courses/30/lessons/12930

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] alphabet = new char[s.length()];
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            alphabet[i] = s.charAt(i);
            if (alphabet[i] == ' ') {
                flag = true;
                continue;
            }

            if (flag) {
                if(alphabet[i] > 96 && alphabet[i] < 123) {
                    alphabet[i] -= 32;
                }
                flag = false;

            }
            else {
                if(alphabet[i] > 64 && alphabet[i] < 91) {
                    alphabet[i] += 32;
                }
                flag = true;
            }

        }

        return answer = new String(alphabet);
    }
}
