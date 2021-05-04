package chapter7_반목문의심화_while문.section2_do_while;

public class 실습7_5_do_while {
    public static void main(String[] args){
        //for문, while문은 조건식이 처음부터 거짓이면 단 한번도 수행하지 않고 종료.
        //하지만 do~while문은 어떠한 경우라도 한 번은 수행함.
        int a=100;

        while(a == 200) //while안에는 조건식
            System.out.println("while문 내부에 들어왔습니다.");

        do{
            System.out.println("do~while문 내부에 들어왔습니다");
            //do~while문은 먼저 내용을 실행->조건식 실행
        }while(a == 200);
        /*
        7행보면 지금 a=100.
        9행 while문은 조건식을 먼저 판단하기 때문에 10행 실행 x
        12행 do~while문은 13행 수행하고 15행 조건식 판단
         */

    }
}
