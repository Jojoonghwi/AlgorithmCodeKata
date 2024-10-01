package 바탕화면정리;
//https://school.programmers.co.kr/learn/courses/30/lessons/161990
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minColumn = 51;
        int minRow = 51;
        int maxRow = -1;
        for (int i = 0; i < wallpaper.length; i++) {
            if (!wallpaper[i].contains("#")) {
                continue;
            }
            if (minColumn > i) {
                answer[0] = i;
                minColumn = i;
            }
            answer[2] = i+1;
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (j < minRow) {
                        answer[1] = j;
                        minRow = j;
                    }

                    if (j > maxRow) {
                        answer[3] = j;
                        maxRow = j;
                    }

                }
            }
        }
        answer[3]++;
        return answer;
    }
}
