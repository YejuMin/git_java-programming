package chapter9_문자열과메소드.section1문자열;

public class 실습9_4_indexOf_lastindexOf {
    public static void main(String[] args){
        //indexOf : 특정 문자열의 위치를 찾기 위해
        //lastindexOf : 찾고자 하는 문자열이 여러 개 나올 경우 마지막 위치를 알려줌.
        //만약에 찾고자 하는 문자열이 없으면 -1을 반환
        String str = "Java 아자아자 Java";

        System.out.println("문자열 : " + str);

        System.out.println("제일 처음 나오는 Java의 위치 : ");
        System.out.println(str.indexOf("Java"));
        System.out.println("마지막에 나오는 Java의 위치 : ");
        System.out.println(str.lastIndexOf("Java"));
    }
}
