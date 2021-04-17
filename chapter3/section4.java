package chapter3;

public class section4 {
    public static void main(String[] args)
    {
        //실습 3-10 소수점이 없는 정수형
        int a =100, b=200;
        float result;

        result = a / b;

        System.out.printf("%f \n", result);
        /*100을 200으로 나눈 값을 출력하는 프로그램이니 0.5가 나올 것 같지만 결과는 0.000000이다.
        이유 = 정수끼리 연산하면(a/b) 그 결과도 정수가 된다. 즉 10행의 a/b는 100/200으로 100과 200이 모두 정수이므로
        그 결과 또한 실수 0.5가 아니라 소수점이 떨어지고 정수만 저장하게 되어 정수0이 된 것이다.
        따라서 10행 result에는 0의 실수값인 0.0이 저장된다.
        숫자 연산(+,-,*,/)에서 실수가 하나라도 들어 있으면 그 결과는 실수가 된다!
         */

        //실습3-10을 제대로 되게 수정해보자
        //hint.a 또는 b의 데이터 형삭울 하나만 바꾼다.
        int a2 =100;
        float b2=200;
        float result2;

        result2 = a2 / b2;

        System.out.printf("%f \n", result2);

        //실습 3-11 소수점이 있는 실수형(float,double 차이 보기)
        float i = 0.1234567890123456789012345f;//java는 실수형 중에서 double을 기본 실수형 취급하기에 float형으로 만들기 위해선 숫자 뒤에 f를 붙여야힘.
        double j = 0.1234567890123456789012345;//i,j 둘 다 같은 값 25자리 대입

        System.out.printf("%30.25f\n",i);
        //float형은 소수점아래 7자리까지 정밀도를 유지하기때문에 7자리까지만 신뢰가능 그 이후는 출력되어도 신뢰 불가능
        System.out.printf("%30.25f\n",j);
        //double형은 소수점아래 15자리까지 정밀도를 유지하기때문에 15자리까지 입력한 값이 출력됨.

        //실습3-12 문자형 변수 사용 예1
        char m,n,c,d,e;

        m = 'A';
        System.out.printf("%c \t", m);
        System.out.printf("%d \n", (int)m);

        n = 'm';
        c = (char)(n+1);
        System.out.printf("%c \t", n);
        System.out.printf("%c \n", c);

        d = 90;
        System.out.printf("%c \n",d);

        d = '가';
        e = (char)(d+1);
        System.out.printf("%d \t",(int)d);
        System.out.printf("%c \n",e);

    }
}
