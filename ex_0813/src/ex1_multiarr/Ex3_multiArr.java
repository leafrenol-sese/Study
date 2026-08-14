package ex1_multiarr;

public class Ex3_multiArr {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8, 9 } }; // 사각형이 아닌 계단형 arr[i].length의 코드를 활용해야한다. 가로줄 방의 갯수

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            } // inner

            System.out.println();
            
        } // outer

    }// main
}// class end
