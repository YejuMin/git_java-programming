package chapter4.section1;

public class 실습4_2 {
    public static void main(String[] args)
    {
        //우선순위롸 강제 형 변환
        int a =2, b=3, c=4;
        int result1, mok, nanugi;
        float result2;

        result1 = a+b-c;
        System.out.printf(" %d + %d - %d = %d\n", a, b, c, result1);

        result1 = a+b*c; //산수랑 똑같이 곱셈,나눗셈 먼저 계산
        System.out.printf(" %d + %d * %d = %d\n", a, b, c, result1);

        result2 = a*b/ (float)c; //정수c를 실수로 강제 형 변환한 다음에 연산.
        //강제형변환을 하지 않으면 답은 1.5가 아니라 1이 됨.
        System.out.printf(" %d + %d - %d = %f\n", a, b, c, result2);

        mok = c/b;
        System.out.printf("%d/%d의 몫은 %d \n",c,b,mok);

        nanugi = c%b;
        System.out.printf("%d /%d의 나머지는 %d\n",c,b,nanugi);

    }
}
