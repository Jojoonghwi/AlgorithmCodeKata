package 직사각형별찍기;
//https://school.programmers.co.kr/learn/courses/30/lessons/12969
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int j=0; j<b; j++) {
            for(int i=0; i<a; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
