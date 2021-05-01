package chapter6.section3;

public class 실습6_17_for문_세미콜론세미콜론 {
    public static void main(String[] args){

        int i;
        i=0;
        for(;;){ //초기값,조건식,증감식이 없음 (초기값, 증감식 밖으로 빼도 세미콜론은 무조건 있어야해)
            System.out.printf("%d \n", i);
            i++;
        }
        //i의 조건이 없으니까 결과는 계속 나올거야 일시정지(Terminate)해 = 무한 루프
    }
}
