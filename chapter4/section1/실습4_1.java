package chapter4.section1;

public class 실습4_1 {
    public static void main(String[] args){
        int a, b =5, c=3;

        a = b + c; //b와 c를 더하기 연산하여 a에 대입.
        System.out.printf("%d+%d=%d \n",b,c,a); //앞줄에서 a에 이미 8 대입됨.

        a = b - c;
        System.out.printf("%d-%d=%d \n",b,c,a);

        a = b * c;
        System.out.printf("%d*%d=%d \n",b,c,a);

        a = b / c;
        System.out.printf("%d/%d=%d \n",b,c,a);

        a = b % c;
        System.out.printf("%d %% %d=%d \n",b,c,a);

    }
}
