package 이진변환반복하기;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] String_arr_a = {"a", "ab", "abc", "b"};
        String[] String_arr_b = {"ab a", "ab abc", "ab b", "abc a", "abc ab", "abc b"};
        int[][] doubleIntARR = {{60, 50} ,{30, 70}, {60, 30}, {80, 40}};
        int[] intARR = {1,3,6,7};
        int[] intARR_2 = {1,3,6,7};
        int k=2;
        int n=3;
        String str="110010101001";

        solution.solution(str);
    }
}
