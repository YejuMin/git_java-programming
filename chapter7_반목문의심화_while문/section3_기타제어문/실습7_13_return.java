package chapter7_반목문의심화_while문.section3_기타제어문;

public class 실습7_13_return {
    public static void main(String[] args){
        //return : 현재 실행하고 있는 메소드를 끝내고, 메소드를 호출한 곳으로 돌아가게 하는 제어문
        //일단, 지금은 메소드 안배웠으니까 return을 만나면 프로그램이 종료된다고 알아두자.
        //정확히 프로그램이 종료되는 것은 아니지만 현재 메소드 main()을 빠져나가는 것이므로 프로그램 종료되는 효

        //1~100 합계를 구하되 중간에 5000이 넘을 경우 메소드를 호출한 곳으로 돌아가는 프로그램을 작성해보자.
        int hap = 0;
        int i;

        for(i=1; i<=100; i++){
            hap += i;
        }
        System.out.printf("1~100 합은 %d",hap);

        if(hap > 5000)
            return;

        System.out.println("프로그램 종료");// 19행에서 return으로 메소드를 끝냈으니 출력 안됨
    }
}
