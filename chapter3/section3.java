package chapter3;

public class section3 {
    public static void main (String[] args){

        //실습 3-7
        int a; //정수형 변수 a 선언
        float b; //실수형 변수 b 선언

        a = (int) 123.45f; //정수형 변수(a)에 실수를 대입했다<-바람직하지않음, 오류 방지를 위해 int를 붙여서 정수로 변환
        //실수형인 float에 값을 대입할 때는 숫자의 맨 뒤에 float를 의미하는 'f'를 붙여야한다.(p99)
        b = 200; //실수형 변수(b)에 정수를 대입했다<-바람직하지 않음.

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %f\n", b);

        //실습 3-8(변수에 값을 대입시키는 것이 아니라 변수에 변수를 대입시켜보자)
        //위 실습 3-7에서 변수 a,b를 써서 한 파일 내에서 쓰면 오류남 i,j로 변경
        int i, j;
        float c, d;

        i = 100;
        j = i; //j에 i값을 대입

        c = 111.1f; //실수는 float와 double이 있는데, 여기서 숫자 뒤에 f를 붙이지 않으면 float가 아닌 double형으로 인식하여 오류 발생
        //자바에서는 실수형 중에서 double형을 기본 실수형으로 취급
        d = c; //d에 c값을 대입

        System.out.printf("i,j=%d,%d \n",i,j);
        System.out.printf("c,d=%5.1f,%5.1f \n",c,d);

        //실습 3-9(변수에 변수를 대입2)
        int l,o,v,e;

        l = 100 + 100; //l에 두 숫자의 계산 결과를 대입한다.
        o = l + 100;//o에 변수와 숫자의 계산 결과를 대입한다.
        v = l + o -100; //v에 변수의 계산 결과와 숫자의 계산 결과를 대입한다.
        e = l+o+v; //e에 l,o,v의 덧셈 결과를 대입한다.
        System.out.printf("l,o,v,e = %d, %d, %d, %d\n",l,o,v,e);

        //l,o,v,e에 모두 같은 값 100을 대입한다(한 문장으로 처리)
        l = o = v = e = 100; //l,o,v,e = 100; 아님!
        //대입 연산자는 맨 뒤에서부터 처리 됨. 34~47행의 l,o,v,e에는 각각 값이 들어있지만 그 값들을 무시하고 새로운 값으로 덮어씀.
        System.out.printf("l,o,v,e=%d, %d, %d, %d\n",l,o,v,e);


        l=100;
        l = l+200; //자신의 l값과 200을 더한 값을 다시 l에 대입한다.
        System.out.printf("l = %d \n",l); //print하니까 오류남.
        //printf만 서식을 지정해서 출력할수있음.우리 지금 %d해서 서식 지정했잖아

        /*
        대입 연산자(=)를 사용하면 오른쪽의 것이 왼쪽에 대입된다.
        대입 연산자(=)의 왼쪽에는 반드시 무엇을 담을 수 있는 그릇, 즉 변수만 올 수 있다는 것을 의미한다.
        10 = 100; <-틀린 문장이다. 오른쪽의 값 100을 왼쪽 그릇에 담아야하는데 왼쪽에는 변수(그릇)이 없기 때문.
        대입 연산자(=)의 오른쪽에는 상수(숫자), 변수, 계산 값이 모두 올 수 있다.
        결론적으로 대입 연산자(=)의 왼쪽에는 '변수'만 가능하고, 오른쪽에는 무엇이든( 값, 변수, 계산값, 메소드 등)이 가능.
         */
    }
}
