package 개인정보수집유효기간;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] String_arr_a = {"Z 3", "D 5"};
        String[] String_arr_b = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[][] doubleIntARR = {{60, 50} ,{30, 70}, {60, 30}, {80, 40}};
        int[] intARR = {7,1,3};
        int[] intARR_2 = {1,3,6,7};
        int i=1048576;
        int j=12345;
        int k=12346;
        String str="2020.01.01";

        solution.solution(str, String_arr_a, String_arr_b);
    }
}
