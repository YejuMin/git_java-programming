package chapter6.section1;

public class 실습6_8_for문_합계구하기_정답 {
    public static void main(String[] args){

        /*
        int hap ; //합계를 누적할 변수 선언
        int i; //1부터 10까지 변하는 변수 선언

        for(i=1; i<=10; i++)
        {
            hap = hap + i ;
        }

        System.out.printf("1에서 10까지 반복해서 누적합 : %d", hap);
        */

        int hap =0 ; //누적 값을 표현하는 변수는 반드시 0으로 초기화 해야해.
        int i; //아래 for문에서 i=0; 으로 초기화하는 부분 있어서 별도로 안해도돼

        for(i=1; i<=10; i++)
        {
            hap = hap + i ;
        }

        System.out.printf("1에서 10까지 반복해서 누적합 : %d", hap);
    }
}
