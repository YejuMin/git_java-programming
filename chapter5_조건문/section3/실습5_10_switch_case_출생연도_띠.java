package chapter5_조건문.section3;

import java.util.Scanner;

public class 실습5_10_switch_case_출생연도_띠 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int year ;

        System.out.println("출생연도를 입력하세요 : ");
        year = s.nextInt();

        switch (year % 12){
            case 0 : System.out.println("원숭이띠"); break;
            case 1 : System.out.println("닭"); break;
            case 3 : System.out.println("돼지띠"); break;
            case 4 : System.out.println("쥐띠"); break;
            case 5 : System.out.println("소띠"); break;
            case 6 : System.out.println("호랑이띠"); break;
            case 7 : System.out.println("토끼띠"); break;
            case 8 : System.out.println("용띠"); break;
            case 9 : System.out.println("뱀띠"); break;
            case 10 : System.out.println("말띠"); break;
            case 11 : System.out.println("양"); break;



        }
    }
}
