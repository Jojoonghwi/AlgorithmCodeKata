package 옹알이2;
//https://school.programmers.co.kr/learn/courses/30/lessons/133499
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] yes = {"aya", "ye", "woo", "ma"};
        String[] no = {"ayaaya", "yeye", "woowoo", "mama"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < yes.length; j++) {
                if (!babbling[i].contains(no[j])) {
                    if (babbling[i].contains(yes[j])) {
                        babbling[i] = babbling[i].replace(yes[j], "Y");
                    }
                }
            }
        }

        for(int i=0; i<babbling.length; i++) {
            babbling[i] = babbling[i].replace("Y", "");
            if (babbling[i].equals("")) {
                answer++;
            }
        }

        return answer;
    }
}
