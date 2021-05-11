package chapter9_문자열과메소드.section1문자열;

import java.util.Scanner;

public class 실습9_2_length메소드사용예2 {
    public static void main(String[] args){
        //문자열을 입력 받은 후 알파벳 o를 $로 변경하여 출력하는 프로그램
        Scanner s = new Scanner(System.in);
        String str;

        System.out.println("문자열 입력");
        str = s.nextLine(); //문자열을 키보드로 입력받음

        System.out.println("출력 문자열");
        for(int i=0; i<str.length();i++){ //문자열 길이만큼 반복한다
            if(str.charAt(i) == 'o')
                System.out.printf("%c", '$'); //문자가 o면 $를 출력
            else
                System.out.printf("%c", str.charAt(i)); //아니면 원래 문자를 출력한다.
        }
    }
}
