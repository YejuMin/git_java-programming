package chapter3;

public class section1 {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("ln은 한 줄 띄기");

        System.out.print("안녕하세요");
        System.out.print(" print는 행 유지");

        //실습 3-2
        System.out.printf("\n"); // printf는 행이 넘어가지 않으므로 강제로 행 넘어가게 함.
        System.out.printf("100"); //printf의 큰따옴표 안에 있는 것이 글자든 숫자든 무조건 글자 취급
        System.out.printf("\n");
        System.out.printf("%d",100); //서식(%d)이 지정된 숫자는 그대로 숫자의 의미를 가짐.
        //서식의 개수와 큰따옴표 뒤에 나오는 숫자나 문자의 개수가 같아야 함.

        System.out.printf("\n");

        //실습 3-1
        System.out.printf("100+100"); //모두 글자 취급
        System.out.printf("\n");
        System.out.printf("%d",100+100); //숫자를 계산해서 결과 출력
        System.out.printf("\n");

        //실습3-3
        System.out.printf("%d/%d = %f", 100,200,0.5); //마지막 숫자가 실수이므로 그에 맞는 서식 f를 써야함.
        System.out.printf("\n");

        //실습3-4(콤마 위치 주의)
        System.out.printf("%c %c \n",'a','K'); //char문자형은 작음 따옴표로 묶여있어야하며 반드시 한글자만 취급
        System.out.printf("%s %s \n", "IT","JAVA"); //string형은 큰 따옴표로 묶여있어야하며 한 글자 이상 취급

    }

}
