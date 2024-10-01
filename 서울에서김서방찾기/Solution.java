package 서울에서김서방찾기;
//https://school.programmers.co.kr/learn/courses/30/lessons/12919
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " +i+ "에 있다";
                break;
            }
        }
        return answer;
    }
}
