package chapter5_조건문.section1;

public class 실습5_3_기본if문 {
    public static void main(String[] args){
        int a = 200;

        if(a<100) {
            System.out.println("100보다 작아요");
            System.out.println("5행에서 a가 200이니 거짓이므로 이 문장은 출력이 안되겠죠?");
            //if 중괄호 없으면 들여쓰기해서 적어도 9행 출력됨 중괄호 주의하자
        }

        System.out.println("프로그램 끝!");
    }
}
