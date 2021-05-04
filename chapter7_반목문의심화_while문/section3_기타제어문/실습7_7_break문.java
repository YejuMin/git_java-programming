package chapter7_반목문의심화_while문.section3_기타제어문;

public class 실습7_7_break문 {
    public static void main(String[] args){
        int i;

        for(i=1; i<=100; i++){
            System.out.printf("for문을 %d 회 실행했습니다.\n",i);
            break;
            //9행 break가 없으면 100번 출력하는 프로그램.for문 순서 생각해보자
        }
        System.out.println("for문을 종료했습니다");
    }
}
