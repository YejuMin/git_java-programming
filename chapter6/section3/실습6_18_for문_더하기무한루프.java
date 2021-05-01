package chapter6.section3;

import java.util.Scanner;

public class 실습6_18_for문_더하기무한루프 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a,b;

        //무한루프를 만들어보자
        for(;;){ //값은 입력받을거니까 초기값 필요x, 무한루프할거니까 조건식x,
            System.out.println("더할 첫 번째 수 입력 : ");
            a = s.nextInt();
            System.out.println("더할 두 번쨰 수 입력 : ");
            b = s.nextInt();
            System.out.printf("%d + %d = %d \n", a,b,a+b);
        }
    }
}
