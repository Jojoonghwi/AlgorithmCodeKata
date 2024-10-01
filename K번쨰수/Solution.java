package K번쨰수;
//https://school.programmers.co.kr/learn/courses/30/lessons/42748
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {

            int size = commands[i][1]-commands[i][0] + 1;
            int start = commands[i][0]-1;
            int[] arr = new int[size];

            for(int j=0; j<arr.length; j++) {
                arr[j] = array[start];
                start++;
            }
            int temp=0;

            for (int k = 0; k < arr.length; k++) {
                for (int l = 0; l < arr.length - 1; l++) {
                    if (arr[l] > arr[l + 1]) {
                        temp = arr[l];
                        arr[l] = arr[l + 1];
                        arr[l + 1] = temp;
                    }
                }
            }
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}
