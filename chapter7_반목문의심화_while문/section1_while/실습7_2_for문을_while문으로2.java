package chapter7_반목문의심화_while문.section1_while;

public class 실습7_2_for문을_while문으로2 {
    public static void main(String[] args){
        //1부터 10까지 합계를 for문에서(실습6_8) while문으로
        /*
        int i;
        int hap = 0;

        for(i=1; i<=10; i++)
        {
            hap = hap+ i;
        }
        System.out.printf("합은 : %d",hap);
        */

        int i =1; //초깃값 위로 빼
        int hap = 0;

        while(i<=10) //while 안에는 조건식만
        {
            hap = hap+i;
            i++; //증감식 괄호 안에 잊지말기!!
        }
        System.out.printf("합은 : %d",hap);
    }
}
