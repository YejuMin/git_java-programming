package chapter4.section4;

public class 실습4_13 {
    public static void main(String[] args){
        //왼쪽 시프트 연산자 사용 예
        //일단 비트 연산자는 정수나 문자등을 2진수로 변환한 다음 각 자리의 비트끼리 연산을 수행하는 것.
        //시프트 연산자도 2진수로 먼저 변환한 후 이동해주는 것.
        //이동 후 뒤에 빈 자리 비트는 0으로 채움
        //시프트 할 때 마다 2^n 을 곱한 것.
        int a = 10;
        System.out.printf("%d를 왼쪽 1회 시프트하면 %d 이다. \n", a, a<<1);
        System.out.printf("%d를 왼쪽 2회 시프트하면 %d 이다. \n", a, a<<2);
        System.out.printf("%d를 왼쪽 3회 시프트하면 %d 이다. \n", a, a<<3);

    }
}
