package chapter6.section1;

import java.util.Scanner;

public class 실습6_11_for문_scanner_변수3개입력받기 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int i;
        int num1,num2,num3;

        System.out.printf("시작 값 입력 : "); //시작값 : num1
        num1 = s.nextInt();
        System.out.printf("최종 값 입력 : "); //최종갑 : num2
        num2 = s.nextInt();
        System.out.printf("증가 값 입력 : "); //증가값 : num3
        num3 = s.nextInt();

        for(i=num1; i<=num2; i+=num3)
        {
            hap +=i;
        }
        System.out.printf("%d부터 %d까지 %d씩 증가한 값 : %d", num1,num2,num3,hap);
    }
}
