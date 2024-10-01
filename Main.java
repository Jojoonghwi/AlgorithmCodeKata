package 바탕화면정리;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] String_arr_a = {"mumu", "soe", "poe", "kai", "mine"};
        String[] String_arr_b = {"kai", "kai", "mine", "mine"};
        int[][] sizes = {{60, 50} ,{30, 70}, {60, 30}, {80, 40}};
        solution.solution(sizes);
    }
}
