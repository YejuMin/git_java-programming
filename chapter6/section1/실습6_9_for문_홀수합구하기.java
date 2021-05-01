package chapter6.section1;

public class 실습6_9_for문_홀수합구하기 {
    public static void main(String[] args){
        int hap = 0;
        int i ;

        //500부터 1000까지 홀수의 합
        for(i=501; i<=1000; i+=2) //홀수만 합할거면 i를 2개씩 키워
        {
            hap += i;
        }

        System.out.printf("500부터 1000까지 홀수의 합 : %d", hap);

    }
}
