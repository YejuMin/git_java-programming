package chapter7_반목문의심화_while문.section2_do_while;

import java.util.Scanner;

public class 실습7_6_do_while_커피주문 {
    public static void main(String[] args){
        //손님이 둘어오면 종업원이 적어도 한 번 이상은 주문 여부를 물어봄->do~while문
        Scanner s = new Scanner(System.in);
        int menu;

        do{
            System.out.println("주문하시겠어요?");
            System.out.println("1.카페라떼 2.아메리카노 3.아이스티 4.이제 그만");
            menu = s.nextInt();

            switch (menu){
                case 1:
                    System.out.println("카페라떼를 주문하셨습니다."); break;
                case 2:
                    System.out.println("아메리카노를 주문하셨습니다."); break;
                case 3:
                    System.out.println("아이스티를 주문하셨습니다."); break;
                case 4:
                    System.out.println("넵"); break;
                default:
                    System.out.println("잘못 주문하셨습니다");
            }
        }while(menu !=4); //선택한 메뉴가 4번이 아니라면 계속 주문 받는다.


    }
}
