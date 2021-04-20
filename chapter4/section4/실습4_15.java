package chapter4.section4;

public class 실습4_15 {
    public static void main(String[] args){
        //왼쪽, 오른쪽 시프트 연산자 사용 예
        int a =100, result;
        int i;

        for(i=1; i<=5; i++){
            result = a<<i;
            System.out.printf("%d << %d = %d\n",a,i,result);
        }

        for(i=1; i<=5; i++){
            result = a>>i;
            System.out.printf("%d >> %d = %d\n",a,i,result);
        }
    }
}
