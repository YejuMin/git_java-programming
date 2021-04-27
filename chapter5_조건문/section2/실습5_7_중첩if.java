package chapter5_조건문.section2;

public class 실습5_7_중첩if {
    public static void main(String[] args){
        int a = 75;

        //중괄호 잘써서 깔끔하게게
        if(a>50){
            if(a<100){
                System.out.println("50보다 크고 100보다 작아요");
            }else{
                System.out.println("100보다도 더 커요!");
            }
        }else{
            System.out.println("50보다 작아요");
        }
    }
}
