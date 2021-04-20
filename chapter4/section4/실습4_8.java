package chapter4.section4;

public class 실습4_8 {
    public static void main(String[] args){

        //비트 논리곱 연산자 사용 예
        System.out.printf("10 & 7 = %d \n", 10&7); //10과 7의 비트 논리곱을 수행한다.
        System.out.printf("123 & 456 = %d \n", 123&456); //123과 456의 비트 논리곱을 수행한다.
        System.out.printf("0xFFFF & 0000 = %d \n", 0xFFFF & 0000);
    }
}
