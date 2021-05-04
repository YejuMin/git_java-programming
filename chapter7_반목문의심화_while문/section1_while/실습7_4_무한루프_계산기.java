package chapter7_반목문의심화_while문.section1_while;

import java.io.IOException;
import java.util.Scanner;

public class 실습7_4_무한루프_계산기 {
    public static void main(String[] args) throws IOException { //throws~ 19행 때문에

        Scanner s = new Scanner(System.in);
        int a,b; //계산 할 수 입력받을거고
        char ch; //계산한 연산자(+,-,*,/) 입력받을거야

        while(true) { //무한루프 쓸거니까
            System.out.println("더할 첫 번째 수 입력 : ");
            a = s.nextInt();
            System.out.println("더할 두 번째 수 입력 : ");
            b = s.nextInt();
            System.out.println("계산할 연산자 입력 : ");
            //연산자를 문자형으로 입력 받는다.
            ch = (char)System.in.read(); //이것땜에 7행 throws~쓴거야

            switch (ch){
                case '+': //여기 세미콜론 아니고 그냥 콜론
                    System.out.printf("%d + %d = %d\n", a,b,a+b); break;
                case '-':
                    System.out.printf("%d - %d = %d\n", a,b,a-b); break;
                case '*':
                    System.out.printf("%d * %d = %d\n", a,b,a*b); break;
                case '/':
                    System.out.printf("%d / %d = %d\n", a,b,a/b); break;
                default:
                    System.out.println("연산자를 잘못 입력했습니다\n");
            }


        }


    }
}
