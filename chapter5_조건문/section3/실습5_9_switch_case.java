package chapter5_조건문.section3;

import java.util.Scanner;

public class 실습5_9_switch_case {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a ;

        System.out.print("1~4중에서 선택하세요 : ");
        a = s.nextInt();

        switch (a){
            case 1:
                System.out.println("1을 선택하셨습니다.");
                break;
                //switch~case 문에서는 break를 꼭 써야함. 안그러면 빠져나가지 않고 다음 코드 계속 수행함.
            case 2:
                System.out.println("2를 선택하셨습니다.");
                break;
            case 3:
                System.out.println("3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("4를 선택하셨습니다.");
                break;
            default:
                System.out.println("1~4 이외의 숫자를 선택하셨습니다.");
        }
    }
}
