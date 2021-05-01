package chapter6.section1;

import java.util.Scanner;

public class 실습6_12_for문_구구단 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i;
        int dan;

        System.out.printf("몇 단?");
        dan = s.nextInt(); //계산할 단을 입력받음.

        for(i=1; i<=9; i++)
        {
            System.out.printf("%d X %d = %d \n", dan,i,dan*i);
        }
    }
}
