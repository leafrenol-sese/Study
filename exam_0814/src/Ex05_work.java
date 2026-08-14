import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {

        // 정수 n1, n2를 입력받고
        // n1 ~ n2사이의 합을 출력
        // -----------------------
        // 수1 : 2
        // 수2 : 5
        // 결과 : 14

        Scanner sc = new Scanner(System.in);

        System.out.print("수 1 :");
        int n1 = sc.nextInt();

        System.out.print("수 2 :");
        int n2 = sc.nextInt();

        int res = 0; // 결과출력용 변수

        if (n1 > n2) { //n1과 n2값을 교환
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }

        for (int i = n1; i <= n2; i++) {
            res += i;
        }

        System.out.print("결과 : " + res);

    }// main
}
