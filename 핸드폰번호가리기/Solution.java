package 핸드폰번호가리기;
//https://school.programmers.co.kr/learn/courses/30/lessons/12948
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] int_number = phone_number.toCharArray();
        for(int i=0; i<int_number.length-4; i++) {
            int_number[i] = '*';
        }

        answer = new String(int_number);
        return answer;
    }
}
