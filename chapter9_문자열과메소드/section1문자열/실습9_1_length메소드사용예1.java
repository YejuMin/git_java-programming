package chapter9_문자열과메소드.section1문자열;

public class 실습9_1_length메소드사용예1 {
    public static void main(String[] args){
        String str = "IT~~"; //문자열 선언하고 대입
        int len; //문자열 배열과 길이를 저장할 변수를 선언
        len = str.length();

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d", len);
    }
}
