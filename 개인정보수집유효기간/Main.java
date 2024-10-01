//https://school.programmers.co.kr/learn/courses/30/lessons/161990
package 개인정보수집유효기간;

public class Main {
    public static void main(String[] args) {
        개인정보수집유효기간.Solution solution = new 개인정보수집유효기간.Solution();

        String[] String_arr_a = {"A 6", "B 12", "C 3"};
        String[] String_arr_b = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        String String_a = "2022.05.19";


        solution.solution(String_a, String_arr_a, String_arr_b);
    }

}