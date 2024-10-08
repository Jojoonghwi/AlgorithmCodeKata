package 이진변환반복하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/70129
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String changeS = "";
        String binary = "";
        int len = 0;
        while (true) {
            //0삭제
            changeS = s.replaceAll("0", "");
            len = changeS.length();
            answer[1] += s.length() - changeS.length();

            //2진 변환
            binary = Integer.toBinaryString(len);
            answer[0]++;
            if (binary.equals("1")) {
                break;
            }
            s = binary;
        }

        return answer;
    }
}
