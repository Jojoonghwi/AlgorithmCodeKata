package 푸드파이트대회;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        String foodLeft = "";
        String foodRight = "";

        for (int i = 1; i < food.length; i++) {
            for (int j = i; j < food[i] / 2 + i; j++) {
                foodLeft += i;
                foodRight = i + foodRight;
            }
        }
        return answer = foodLeft + "0" + foodRight;
    }
}