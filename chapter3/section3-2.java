package chapter3;

public class section2 {
    public static void main(String[] args) {
        System.out.printf("%d\n", 123);
        System.out.printf("%5d\n", 123); //오른쪽에 붙여서 정렬, 5자리 확보
        System.out.printf("%05d\n", 123); //오른쪽에 붙여서 정렬, 빈칸을 0으로 채움
        //소수점도 확보된 자리에서 한 자리 차지하는거야

        System.out.printf("%f\n", 123.45); //소수점 여섯자리까지 무조건 출력
        System.out.printf("%7.1f\n", 123.45);//7자리 확보하긴 하는데 소수점 아래 첫째 자리만 출력, 둘째 자리에서 반올림
        System.out.printf("%7.3f\n", 123.45);//7자리 확보, 소수점 아래 셋째 자리까지 출력, 오른쪽 빈칸은 0으로 채움

        System.out.printf("%s\n", "hello"); //그냥 자릿수만큼 출력
        System.out.printf("%10s\n", "hello"); //10자리 확보 + 오른쪽 정렬

        //2.다양한 기능의 서식 문자
        //서식 문자의 특징 = 앞에 \n을 붙임, 이를 탈출(escape) 문자라고도 함
        System.out.printf("\n줄바꿈\n연습 \n");
        System.out.printf("\t탭키\t연습 \n");
        System.out.printf("이것을\r덮어씁니다 \n"); //'이것을'이 출력되었다가 \r을 만나서 다시 처음 위치로 돌아간 다음 '덮어씁니다'를 출력하므로 결국 '이것을'이 지워짐
        System.out.printf("글자가 \"강조\"되는 효과 \n");
        System.out.printf("\\\\\\역슬래시 세개 출력 \n"); //역슬래시 하나를 쓰려면 \를 두 번 써야함.

    }
}