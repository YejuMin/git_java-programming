package chapter9_문자열과메소드.section1문자열;

import java.util.Scanner;

public class 실습9_3_startsWith_endsWith {
    public static void main(String[] args){
        //문자열의 처응ㅁ 또는 끝이 특정 문자열인지 파악할 때 쓰는 메소드
        //돌려주는 값은 논리형인 true/false

        //입력한 문자열의 처음과 끝이 괄호인지 확인하고, 괄호가 아니면 처음과 끝에 괄호를 넣어보자(치환아님 추가임)
        Scanner s =  new Scanner(System.in);
        String str;

        System.out.println("문자열 입력");
        str = s.nextLine(); //문자열을 키보드로 입력받는다

        System.out.println("출력 문자열"); //문자열의 시작이 ( 가 아니면 ( 출력
        if(!str.startsWith("("));
            System.out.printf("("); //괄호 오타아님

        for(int i=0; i<str.length(); i++) //입력한 문자를 모두 출력함.
            System.out.printf("%c", str.charAt(i));

        if(!str.endsWith(")")) //문자열의 끝이 ( 가 아니면 ( 출력
            System.out.printf(")");
    }
}
