package ex10_work;


public class WorkSub {

    private int num = 1;
    private int y; //y축 관리(행: 세로줄)
    private int x; //x축 관리(열: 가로줄)
    private int [][] arr;

    public int[][] square(int size){

        x = size / 2; //x값 초기화+가장 먼저 시작 어떤 수를 넣어도 중앙부터 시작 
        arr = new int[size][size];
        
        int[][] square = new int[size][size];
        int num = 1; // 마방진에 들어갈 시작수

        while (num <= size * size) { // y=0 x=1

            arr[y][x] = num; // [y=0 x=1]->1이 들어간다
            //[][1][]
            //[][][]
            //[][][]
            if (num % size == 0) { // 1/3 !=0 거짓으로 else시작)
                y++;
            } else {
                y--; // -1
                x++; // 2
            }//if-else

            if (y < 0)  // 참, y = 3 - 1 => y=2
                y = size - 1;
            
            if (x >= size) 
                x = 0;

            num++; // num=2 로 증가 ~> while 아래 square[y][x] => square[y][x]

        }// while
        return arr;

            
    }//method

}
