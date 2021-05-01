package chapter6.section3;

public class 실습6_16_for문_증감식 {
    public static void main(String[] args){
        //for문에 들어가는 초기값이 반드시 한 개일 필요는 없음
        //여러 개를 초기화할 때는 쉼표(,)로 구분해야함.

        int i,k;

        for(i=1,k=1; i<=9; i++,k++) //초기값과 증감식이 2개
            System.out.printf("%d X %d = %d \n", i, k, i*k);

    }
}
