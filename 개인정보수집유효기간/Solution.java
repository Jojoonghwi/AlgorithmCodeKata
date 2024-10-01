package 개인정보수집유효기간;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        String[] privaciesType = new String[privacies.length];
        String[] termsType = new String[terms.length];
        for (int i = 0; i < privacies.length; i++) {

            privaciesType = privacies[i].split(" ");
            termsType = terms[i].split(" ");
        }


        return answer;
    }
}