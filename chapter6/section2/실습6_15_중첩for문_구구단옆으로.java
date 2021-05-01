package chapter6.section2;

public class 실습6_15_중첩for문_구구단옆으로 {
    public static void main(String[] args) {
        int i, k;

        for (i = 1; i <= 9; i++) {
            for (k = 2; k <= 9; k++) {
                System.out.printf("%3d X %d = %2d", k, i, k * i);
            }
            System.out.printf("\n"); //2X1=2 ~ 9X1=9 까지 쓰고 한줄 띄기
        }
    }
}
