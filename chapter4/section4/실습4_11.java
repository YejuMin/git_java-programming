package chapter4.section4;

public class 실습4_11 {
    public static void main(String[] args){
        //비트 연산에 마스크를 사용한 예
        byte a ='A',b;
        byte mask = 0x0F;

        System.out.printf("%X & %X = %X \n", a, mask, a&mask);
        System.out.printf("%X | %X = %X \n", a, mask, a|mask);

        mask = 'a'-'A';

        b = (byte)(a^mask);
        System.out.printf("%c ^ %d = %c \n", a, mask, b);
        a = (byte)(b^mask);
        System.out.printf("%c ^ %d = %c \n", b, mask, a);

    }
}
