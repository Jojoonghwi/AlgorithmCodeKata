package _2016년;
//https://school.programmers.co.kr/learn/courses/30/lessons/12901
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = new int[13];

        for(int i=1; i<a; i++) {
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
                b += 31;
            }
            else if(i==4 || i==6 || i==9 || i==11) {
                b += 30;
            }
            else if(i==2) {
                b += 29;
            }
        }

        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int day = b%7;


        return answer = week[day];
    }
}
