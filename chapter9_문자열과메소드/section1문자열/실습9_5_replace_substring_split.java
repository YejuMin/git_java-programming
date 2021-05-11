package chapter9_문자열과메소드.section1문자열;

import java.util.Scanner;

public class 실습9_5_replace_substring_split {
    public static void main(String[] args){
        //replace :  문자열을 바꿔줌
        //substring : 일부 문자열 추출
        //split : 문자열 분리
        Scanner s = new Scanner(System.in);
        String str, strRep, strSub, strAry[]; //입력받을 문자열, 바꿀 문자열, 일부 문자열, 분리한 문자열 배열 선언

        System.out.println("문자열을 입력하세요");
        str = s.nextLine();

        strRep = str.replace("","$"); //공백을 $로 바꿈
        strSub = str.substring(3,8); //3번째부터 8번째 문자를 출력
        strAry = str.split(""); //공백으로 분리한다.

        System.out.println("입력 문자열 : "+str);
        System.out.println("바꾼 문자열 : "+strRep);
        System.out.println("일부 문자열 : "+strSub);
        for(int i=0; i < strAry.length; i++) //분리한 문자얄 베열을 하나씩 출력
            System.out.println("분리한 문지열 +i+"+strAry[i]);
    }
}
