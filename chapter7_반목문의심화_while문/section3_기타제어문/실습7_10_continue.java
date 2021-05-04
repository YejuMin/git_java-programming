package chapter7_반목문의심화_while문.section3_기타제어문;

public class 실습7_10_continue {
    public static void main(String[] args){
        //continue문을 만나면 블록의 남은 부분을 건너뛰고 반복문의 처음으로 돌아간다.
        //즉 처음부터 반복문을 다시 수행

        //1~100합을 구하되 3의 배수를 제외하고 더해라
        int hap=0;
        int i;

        for(i=1; i<=100; i++){
            if(i%3 == 0) { //3으로 나눈 나머지가 0이면
                continue; //3 더할 차례에 continue
            }

            hap = hap+i;
        }
        System.out.printf("1~100까지 합(3의 배수 제외) : %d",hap);
    }
}
