package chapter4.section2;

public class 실습4_5 {
    public static void main(String[] args){
        //관계 연산자 사용 ex. ==,!=,>,<,>=,<=

        int a=100, b=200;

        System.out.printf("%d == %d는 %s이다.\n", a, b, a==b);
        System.out.printf("%d != %d는 %s이다.\n", a, b, a!=b);
        System.out.printf("%d > %d는 %s이다.\n", a, b, a>b);
        System.out.printf("%d < %d는 %s이다.\n", a, b, a<b);
        System.out.printf("%d >= %d는 %s이다.\n", a, b, a>=b);
        System.out.printf("%d <= %d는 %s이다.\n\n", a, b, a<=b);

        System.out.printf("%d = %d는 %s이다.\n", a, b, a=b); //이건 대입연산자
        //==와 =은 완전히 다른 것, ==은 깂이 같은지를 확인하는 관계 연산자고 =은 오른쪽의 값을 왼쪽에 대입하는 대입연산자

    }
}
