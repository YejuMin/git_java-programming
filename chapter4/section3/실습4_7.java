package chapter4.section3;

public class 실습4_7 {
    public static void main(String[] args){
        //논리 연산자 사용2
        int num1=100, num2=-200;

        boolean a = (num1 !=0);
        //num1이 0이 아니면 true
        //num1 값이 0이 아닌지를 확인하여 논리형 변수 a에 true/false 값을 저장한다.
        //관계연산자(==,!=,>,<,>=,<=)의 결과는 항상 true/false
        boolean b = (num2 !=0);

        System.out.printf("상수의 AND 연산 : %s \n", a&&b);
        System.out.printf("상수의 OR 연산 : %s \n", a||b);
        System.out.printf("상수의 NOT 연산 : %s \n", !a);
    }
}
