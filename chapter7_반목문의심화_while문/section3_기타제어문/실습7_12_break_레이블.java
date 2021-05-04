package chapter7_반목문의심화_while문.section3_기타제어문;

public class 실습7_12_break_레이블 {
    public static void main(String[] args){
        //실습7_11과 같은 무한 반복을 방지하기 위해서는 break문을 별도로 지정한 레이블(label)을 사용
        int hap = 0;
        int i;

        myLabel: for(;;){ //바깥 for문에 레이블을 지정한다.
            for(i=1; i<=100; i++){
                hap += i;
                if(hap > 2000){
                    System.out.printf("%d\n",hap);
                    hap = 0;
                    break myLabel;
                }
            }
            System.out.println("아직 반복중"); //바깥 for문 빠져나가서 출력 안됨
        }
    }
}
