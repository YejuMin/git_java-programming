package chapter4.section4;

public class 실습4_12 {
    public static void main(String[] args){
        //비트 부정 연산자 사용 예
        //비트 부정 연산자(또는 보수 연산자) : 두 수에 대해 연산하는 것이 아닌 각 비트를 반대로 만드는 연산자.
        //0은 1로, 1은 0으로
        //이렇게 반전된 값을 1의 보수라 하며 그 값에 1을 더한 값을 2의 보수라 함.
        //해당 값의 음수 값을 찾고자 할때 사용
        //ex. 정수 값에 비트 부정을 수행한 다음 1을 더하면 그 값의 음수 값을 얻을 수 있음.
        int a= 12345;

        System.out.printf("%d \n", ~a+1);

    }
}
