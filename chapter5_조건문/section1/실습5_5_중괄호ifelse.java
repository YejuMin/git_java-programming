package chapter5_조건문.section1;

public class 실습5_5_중괄호ifelse {
    public static void main(String[] args){
        int a = 200;

        if(a<100) {
            System.out.println("100보다 작아요");
            System.out.println("참이면 이 문장이 보일거예요!");
        }
        else{
            System.out.println("100보다 커요");
            System.out.println("거짓이면 이 문장이 보일거예요");
        }

        System.out.println("프로그램 끝");
    }
}
