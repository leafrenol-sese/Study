package ex1_multiarr;

public class Ex1_multiArr {
    public static void main(String[] args) {

        int[][] test = new int[2][3];
        /*
         * <위의 이차원 배열을 그림으로 표현>
         * new int [y축][x축] 세로2/가로3
         * stack | heap
         * --------------------------
         * test | [ 0 | 1 ] 0열 1열 2열
         * | 0행: 1번방에 [100|200|300]
         * | 1행: 2번방에 [400|500|600]
         * 내용은 아래를 참조함
         */
        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;

        test[1][0] = 400;
        test[1][1] = 500;
        test[1][2] = 600;

        // test[2][0] = 700; 없는 방, 2는 없다. 0과 1뿐
        // 이차원 배열은 이중for문이 필수다

        for (int i = 0; i < test.length; i++) {

            for (int j = 0; j < test[i].length; j++) {// test[i].length = i가 0일 때의 인덱스의 갯수

                System.out.print(test[i][j] + " ");// 출력하고, 안쪽for문이 felse가 될때까지 반복, 안쪽 for문이 끝나면 밖쪽 for문의 i가 증가

            } // inner

            System.out.println();

        } // outer

    }// main
}// class end
