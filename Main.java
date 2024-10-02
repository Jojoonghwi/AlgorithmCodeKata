package 명예의전당1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] String_arr_a = {"mumu", "soe", "poe", "kai", "mine"};
        String[] String_arr_b = {"kai", "kai", "mine", "mine"};
        int[][] sizes = {{60, 50} ,{30, 70}, {60, 30}, {80, 40}};
        int[] food = {10, 100, 20, 150, 1, 100, 200};
        int k=8;
        solution.solution(k, food);
    }
}
