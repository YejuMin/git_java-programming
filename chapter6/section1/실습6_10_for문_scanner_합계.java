package chapter6.section1;

import java.util.Scanner;

public class 실습6_10_for문_scanner_합계 {
    public static void main(String[] args){

        //1부터 입력받은 수까지 합계 구하기
        Scanner s = new Scanner(System.in);
        int hap =0;
        int i;
        int num;

        System.out.print("값 입력 : ");
        num = s.nextInt();

        for(i=1; i<=num; i++)
        {
            hap += i;
        }
        System.out.printf("1에서 %d까지의 합 : %d",num, hap);
    }
}
