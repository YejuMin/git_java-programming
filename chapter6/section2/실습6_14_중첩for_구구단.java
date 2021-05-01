package chapter6.section2;

public class 실습6_14_중첩for_구구단 {
    public static void main(String[] args)
    {
        //2~9단 구구단을 만들어보자
        int i,k;

        for(i=2;i<=9;i++){ //2~9단을 반복
            for(k=1; k<=9; k++){
                System.out.printf("%d X %d = %d \n", i,k,i*k);
            }
            System.out.print("\n"); //단이 끝나면 한 줄 띄운다
        }
    }
}
