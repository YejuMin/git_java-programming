package chapter4.section4;

public class 실습4_14 {
    public static void main(String[] args){
        //오른쪽 시프트 연산자 사용 예
        //앞의 빈 비트는 0으로 채우고 뒤의 비트는 사라짐
        //오른쪽 시프트 연산은 2^n으로 나누는 것과 같음.
        int a =10;
        System.out.printf("%d를 오른쪽 1회 시프트하면 %d이다. \n",a,a>>1);
        System.out.printf("%d를 오른쪽 2회 시프트하면 %d이다. \n",a,a>>2);
        System.out.printf("%d를 오른쪽 3회 시프트하면 %d이다. \n",a,a>>3);
        System.out.printf("%d를 오른쪽 4회 시프트하면 %d이다. \n",a,a>>4);


    }
}
