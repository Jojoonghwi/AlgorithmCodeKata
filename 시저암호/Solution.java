package 시저암호;
//https://school.programmers.co.kr/learn/courses/30/lessons/12926
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == ' ') {
                continue;
            }
            arr[i] = (char)(arr[i]+n);
            if(arr[i]-n > 64 && arr[i]-n <91) {
                if(arr[i] > 90 && arr[i] < 122) {
                    arr[i] = (char)(arr[i]-26);
                }
            }
            else {
                if(arr[i] > 122) {
                    arr[i] = (char)(arr[i]-26);
                }
            }



        }

        String str = new String(arr);
        answer = str;
        return answer;
    }
}
