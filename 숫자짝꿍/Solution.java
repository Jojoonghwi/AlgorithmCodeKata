package 숫자짝꿍;
//https://school.programmers.co.kr/learn/courses/30/lessons/131128
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] arr_x = new int[10];
        int[] arr_y = new int[10];
        int[] sum_xy = new int[10];

        int index_x = 0;
        for (int i = 0; i < X.length(); i++) {
            index_x = X.charAt(i) - '0';
            arr_x[index_x]++;
        }
        int index_y = 0;
        for(int i = 0; i < Y.length(); i++) {
            index_y = Y.charAt(i) - '0';
            arr_y[index_y]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >=0; i--) {
            int count = Math.min(arr_x[i], arr_y[i]);
            sum_xy[i] = count;
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) {
            return "-1";
        }

        else if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}
