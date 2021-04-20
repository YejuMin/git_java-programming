package chapter4.section4;

public class 실습4_10 {
    public static void main(String[] args) {

        //비트 배타적 논리합 연산자 사용 예
        //비트 배타적 논리합 연산자(^) : 두 값이 다르면 1, 같으면 0
        //1^1 = 0, 0^0= 0 1^0 =1, 0^1=1
        System.out.printf("10 ^ 7 = %d \n",10^7); //10와 7의 비트 배타적 논리합을 수행한다.
        System.out.printf("123 ^ 456 = %d \n",123^456); //123과 456의 비트 배타적 논리합을 수행한다.
        System.out.printf("0xFFFF ^ 0000 = %d \n",0xFFFF^0000);
    }
}
