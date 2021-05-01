package chapter6.section1;

public class 실습6_3_for문_중괄호안쓰면 {
    public static void main(String[] args){
        int i;

        for(i=0; i<3; i++)
        {
            System.out.println("안녕하세요");
            System.out.println("또 안녕하세요");
        }
        System.out.printf("\n\n");

        for(i=0; i<3; i++) //여기는 중괄호 안써볼게
            System.out.println("안녕하세요"); //중괄호 안써서 15행까지만 두번째 for문에 속하는거야 3번 실행되는건 15행.
            System.out.println("또 안녕하세요");
    }
}
