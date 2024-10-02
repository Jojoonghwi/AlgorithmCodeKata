package 덧칠하기;

import java.util.ArrayList;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int index=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < section.length; i++){
            list.add(section[i]);
        }
        while(!list.isEmpty()){
            index = list.get(0);
            //리스트의 첫번째 값부터 탐색
            for(int i=index; i<index+m; i++){
                if(list.contains(i)){
                    list.remove(0);
                }
                if(list.isEmpty()){
                    break;
                }
            }
            answer++;
        }

        return answer;
    }
}
