package chapter7_반목문의심화_while문.section3_기타제어문;

public class 실습7_11_다중반복문_무한루프 {
    public static void main(String[] args){
        //다중 반복문에서 break를 만나면 가장 가까운 반복문을 빠져나간다.
        //2000이 넘으면 그 값을 출력하고 종료하는 프로그램
        int hap = 0;
        int i;

        for(;;){
            for(i=1; i<=100; i++){
                hap += i;
                if(hap>2000){
                    System.out.printf("%d\n",hap); //합계가 2000이 넘으면 hap을 출력
                    hap = 0; //합계를 초기화
                    break; //반복문을 탈출
                }
            }
            System.out.println("아직 반복중"); //무한반복을 확인하기 위한 출력

            /*
            2000이 넘는 값을 만나면 16행에서 break문을 만나 반복문을 빠져나가려고 시도
            하지만 가까운 for문을 탈출해서 19행을 출력하고 다시 11행~의 무한 for문을 만나 다시 시작
            즉 결국 무한루프
             */
        }
    }
}
