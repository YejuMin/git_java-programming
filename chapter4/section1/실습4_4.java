package chapter4.section1;

public class 실습4_4 {
    public static void main(String[] args){
        int a =10, b;

        //b=a를 수행한 다음 a를 1증가시킨다.
        b = a++; //후치 증가 연산자
        System.out.printf("a= %d, b= %d \n",a, b);

        //a를 1 증가 시킨 다음 b=a를 수행한다.
        b = ++a;
        System.out.printf("a= %d, b= %d \n",a, b);
        //8.9행 영향 12,13행이 받음 이미 12,13 계산하기 전부터 8.9행 때문에 a=11,b=10이야
    }
}
