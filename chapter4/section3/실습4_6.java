package chapter4.section3;

public class 실습4_6 {
    public static void main(String[] args){
        //논리 연산자 ex. &&,||,!
        int a = 99;

        System.out.printf("AND연산자 : %s \n",(a>=100)&&(a<=200));
        //true, false 를 받기 위한 문자형 %s
        System.out.printf("OR연산자 : %s \n",(a>=100)||(a<=200));
        System.out.printf("NOT연산자 : %s \n",!(a==100));
    }
}
