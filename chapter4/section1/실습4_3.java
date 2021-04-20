package chapter4.section1;

public class 실습4_3 {
    public static void main(String[] args) {

        //증감 연산자와 대입 연산자
        int a = 10;

        a++; //a=a+1; 과 동일하다
        System.out.printf("a++ ==> %d\n", a); //위에서 a++하고 a에 이미 11 대입된거야

        a--; //a=a-1; 과 동일
        System.out.printf("a-- ==> %d\n", a);

        a+=5; //a=a+5; 동일
        System.out.printf("a+=5 ==> %d\n", a);

        a-=5; //a=a-5; 동일
        System.out.printf("a-=5 ==> %d\n", a);

        a*=5; //a=a*5; 동일
        System.out.printf("a*=5 ==> %d\n", a);

        a/=5; //a=a/5; 동일
        System.out.printf("a/=5 ==> %d\n", a);

        a%=5; //a=a%5; 동일
        System.out.printf("a%%=5 ==> %d\n", a);
    }
}