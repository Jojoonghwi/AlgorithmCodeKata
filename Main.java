package 푸드파이트대회;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] String_arr_a = {"mumu", "soe", "poe", "kai", "mine"};
        String[] String_arr_b = {"kai", "kai", "mine", "mine"};
        int[][] sizes = {{60, 50} ,{30, 70}, {60, 30}, {80, 40}};
        int[] food = {1,3,4,6};
        solution.solution(food);
    }
}
