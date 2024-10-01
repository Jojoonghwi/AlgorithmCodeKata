package 소수만들기;
//https://school.programmers.co.kr/learn/courses/30/lessons/12977
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> sosu = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sosu.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        int notsosu=0;
        for (int i = 0; i < sosu.size(); i++) {
            for (int j = 2; j < sosu.get(i); j++) {
                if (sosu.get(i) % j == 0) {
                    notsosu++;
                    break;
                }
            }
        }

        return answer = sosu.size() - notsosu;
    }
}
