package 문자열내림차순으로배치하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/12917
class Solution {
    public String solution(String s) {
        String answer = "";
        char max = 'a';
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] < arr[j]) {
                    max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = max;
                }
            }
        }

        String str1 = new String(arr);

        return answer = str1;
    }
}
