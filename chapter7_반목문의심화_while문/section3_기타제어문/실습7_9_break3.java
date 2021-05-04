package chapter7_반목문의심화_while문.section3_기타제어문;

public class 실습7_9_break3 {
    public static void main(String[] args){
        //1부터 100까지 더하는데 합계가 1000이 되는 위치를 알아내보자
        int hap = 0; //합계는 초깃값 지정해줘야해
        int i;

        for(i=1; i<=100; i++){
            hap = hap+i;

            if(hap >= 1000)
                break;
        }
        System.out.printf("1~100의 합에서 최초로 1000이 넘는 위치는? %d \n",i);
        //출력 결과 45가 나옴 = 1~44까지는 합이 1000미만이고 45를 더하는 순간 1000이상.
    }
}
