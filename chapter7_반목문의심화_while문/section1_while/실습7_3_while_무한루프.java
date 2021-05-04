package chapter7_반목문의심화_while문.section1_while;

import java.util.Scanner;

public class 실습7_3_while_무한루프 {
    public static void main(String[] args){
        /*
        for문의 무한루프를 사용하려면 for(;;)과 같이 표현하면 됨.
        while문에서도 무한 루프 가능.
        무한루프를 적용하려면 while(조건식)이 무조건 참이면 됨.
        while(true)는 for(;;)과 동일한 기능
        */

        /*실습6_18을 while문으로 변경해보자
        Scanner s = new Scanner(System.in);
        int a,b;

        for(;;){ //값은 입력받을거니까 초기값 필요x, 무한루프할거니까 조건식x,
            System.out.println("더할 첫 번째 수 입력 : ");
            a = s.nextInt();
            System.out.println("더할 두 번쨰 수 입력 : ");
            b = s.nextInt();
            System.out.printf("%d + %d = %d \n", a,b,a+b);
            }
         */
        Scanner s = new Scanner(System.in);
        int a, b;

        while(true)
        {
            System.out.println("더할 첫 번째 수 입력 : ");
            a = s.nextInt();
            System.out.println("더할 두 번째 수 입력 : ");
            b = s.nextInt();
            System.out.printf("%d + %d = %d \n",a,b,a+b);
        }
    }
    //무한루프문이라 실행하고 터미네이트 버튼 눌러야함
}
