package chapter7_반목문의심화_while문.section3_기타제어문;

import java.util.Scanner;

public class 실습7_8_break2 {
    public static void main(String[] args){
        //무한루프,두 수를 더하는 실습7_3을 break문 사용하되
        //첫 번째 숫자에 0이 있으면 자동으로 종료되도록 해보자
        Scanner s = new Scanner(System.in);
        int a,b;

        while(true){
            System.out.println("더할 첫 번째 숫자 입력 : ");
            a = s.nextInt();
            System.out.println("더할 두 번째 숫자 입력 : ");
            b = s.nextInt();

            if(a == 0)
                break;

            System.out.printf("%d + %d = %d",a,b,a+b);
        }
        System.out.println("0을 입력해서 반복문을 탈출했습니다");
    }
}
