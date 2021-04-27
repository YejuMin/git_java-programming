package chapter5_조건문.section1;

import java.util.Scanner;
//import행은 입력하는거 아니야 7행 Scanner치면 빨간줄나와 그때 shift+control+o 눌러

public class 실습5_6_홀짝계산_ifelse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("정수를 입력하세요 : ");
        a = s.nextInt(); //정수를 입력받음

        if(a%2 == 0) { //입력한 값을 2로 나누어(%) 나머지가 0이면(=짝수면)
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }
    }
}
