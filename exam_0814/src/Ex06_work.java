import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {

        // 정수 : 7
        // 7은(는) 소수입니다

        // 정수 : 10
        // 10은(는) 소수가 아닙니다

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int n = sc.nextInt();

        int i = 2; // 아래의 if문까지 보기 위해서 빼둠

        for (; i < n; i++) { // i는 위에꺼 사용
            if (n % i == 0)
                break; // 여기서 변경된 i값이 브레이크로 나와 아래의 if문을 수행
        } // for

        if (i == n) {
            System.out.print(n + "은(는) 소수 입니다");
        } else {
            System.out.print(n + "은(는) 소수가 아닙니다");
        }

    }// main
}
