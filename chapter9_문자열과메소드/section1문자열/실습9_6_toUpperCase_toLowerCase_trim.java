package chapter9_문자열과메소드.section1문자열;

public class 실습9_6_toUpperCase_toLowerCase_trim {
    public static void main(String[] args){
        //toUpperCase : 영문인 경우 대문자로
        //tolowerCase : 영문인 경우 소문자로
        //trim : 앞뒤 공백 문자를 제거

        String str = "   한글   ABCD hello   ";
        System.out.println("원 문자열 : [" + str +"]");
        System.out.println("대문자로 : [" +str.toUpperCase() + "]");
        System.out.println("소문자로 : [" +str.toLowerCase() + "]");
        System.out.println("공백제거 : ["+str.trim()+"]");
        //실행결과를 보면 trim()은 앞뒤의 공백은 없애주지만 중간의 공백은 없애지않음.
    }
}
