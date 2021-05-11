package chapter9_문자열과메소드.section1문자열;

public class 실습9_7_공백없애기 {
    public static void main(String[] args){
        String str = "   한글  AB   abc   ";
        String result = "" ; //결과를 저장할 문자열 변수

        for(int i=0; i<str.length(); i++) {
            //if (str.charAt(i) != '')
                result += str.substring(i, i + 1);
        }
    }
}
