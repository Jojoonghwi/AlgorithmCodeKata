package 카드뭉치;
//https://school.programmers.co.kr/learn/courses/30/lessons/159994
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int cards1_index = 0;
        int cards2_index = 0;
        for (int i = 0; i < goal.length; i++) {
            if (cards1.length > cards1_index && goal[i].equals(cards1[cards1_index])) {
                cards1_index++;
            }
            else if (cards2.length > cards2_index && goal[i].equals(cards2[cards2_index])) {
                cards2_index++;
            }
            else {
                return answer = "No";
            }
        }
        return answer = "Yes";
    }
}
