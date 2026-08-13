package ex_work;

import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {

        // 키보드에서 정수를 10개 입력받아 배열에 담고
        // 가장 많이 등장한 정수와 등장 횟수를 출력
        // --------------------------
        // 정수 :
        // 1
        // 1
        // 2
        // 2
        // 2
        // 3
        // 4
        // 2
        // 5
        // 6
        // 가장 많이 등장한 숫자 : 2
        // 등장 횟수 : 4

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        } // for1

        int count = 0;
        int max = 0; // 가장 큰 수를 저장하는 곳

        for (int i = 0; i < arr.length; i++) {

            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) { //i번 돌리는 중, j번 입력된 숫자들이 같을 때, 카운트한다
                    cnt++;// 몇번 등장했는지 세는 곳
                } // inner-if

            } // inner

            if (cnt > count) {
            count = cnt; 
            max = arr[i];
            } // outer-if

        } // outer

        System.out.println("가장 많이 등장한 : " + max);
        System.out.println("등장횟수 : " + count);

    }// main
}// class
