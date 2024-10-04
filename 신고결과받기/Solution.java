package 신고결과받기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        List<String> reportList = Arrays.asList(report);
        List<String> reportNewList = reportList.stream().distinct().collect(Collectors.toList());

        List<String> listSingo = new ArrayList<>();
        List<String> listBeSingo = new ArrayList<>();

        //신고자와 피신고자 나누기
        for(int i = 0; i < reportNewList.size(); i++){
            String[] stChange1 = reportNewList.get(i).split(" ");
            listSingo.add(stChange1[0]);
            listBeSingo.add(stChange1[1]);
        }

        int[] beSingoCnt = new int[id_list.length];
        int[] singoCnt = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++){
            //피신고자 횟수 카운트
            beSingoCnt[i] = Collections.frequency(listBeSingo, id_list[i]);
            //피신고 횟수 k이상이면 X로 치환
            if(beSingoCnt[i] >= k){
                Collections.replaceAll(listBeSingo, id_list[i], ("X"));
            }
        }

        List<String> listTest = new ArrayList<>();
        for(int i = 0; i < listBeSingo.size(); i++){
            listTest.add(listSingo.get(i) + listBeSingo.get(i));
        }

        for(int i = 0; i < listTest.size(); i++){
            for(int j = 0; j < id_list.length; j++){
                if(listTest.get(i).contains("X")){
                    if (listTest.get(i).contains(id_list[j])) {
                        singoCnt[j]++;
                        break;
                    }
                }
            }
        }

        return answer = singoCnt;
    }
}
