package chapter6.section2;

public class 실습6_13_중첩for {
    public static void main(String[] args){
        int i,k;

        for(i=0; i<3; i++)
        {
            for(k=0; k<2; k++)
            {
                System.out.printf("중첩 for문입니다.(i값 : %d, k값 : %d)\n", i,k);
                //i와 k값을 총 6번 (3*2) 출력함
            }
        }
    }
}
