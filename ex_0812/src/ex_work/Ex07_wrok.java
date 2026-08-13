package ex_work;

public class Ex07_wrok {
    public static void main(String[] args) {

        // 배열 arr을 오름차순으로 출력
        // -----------------
        // 11 7 9 20 15 3
        // 3 7 9 11 15 20

        int[] arr = { 11, 7, 9, 20, 15, 3 };

        System.out.print("원본배열 : ");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.print("\n오름차순 : ");

        // arr을 오름차순으로 정렬
        for (int i = 0; i < arr.length; i++) { // i=0, j=0, length=6

            for (int j = i; j < arr.length; j++) {

                if (arr[j] < arr[i]) { // i=1 j=2 // i=0[11] j=1[11] 같은 수라서 felse 안쪽for문부터 다시 시작
                    int tmp = arr[i]; // tmp=11
                    arr[i] = arr[j]; // arr 1 = 11, arr 2 = 9
                    arr[j] = tmp; // arr [2] = tmp에 일시저장
                    // {7, 9, 11, 20}로 변경

                } // if

            } // inner

        } // outer

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } // 바뀐 내용을 출력

        System.out.println("-----------------------");

        int[] arr2 = { 11, 7, 9, 20, 15, 3 };

        // 배열을 오름차순으로 정렬
        for (int i = 0; i < arr2.length - 1; i++) {

            for (int j = i + 1; j < arr2.length; j++) {

                if (arr2[i] > arr2[j]) {

                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        // 배열 출력
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }// main
}// class end
