package 덧칠하기;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] String_arr_a = {"mumu", "soe", "poe", "kai", "mine"};
        String[] String_arr_b = {"kai", "kai", "mine", "mine"};
        int[][] sizes = {{60, 50} ,{30, 70}, {60, 30}, {80, 40}};
        int[] food = {1,3,6,7};
        int k=10;
        int n=3;
        solution.solution(k, n, food);
    }
}
