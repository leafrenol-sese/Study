package ex07_work;

import java.util.Random;

public class Graph {
    public static void main(String[] args) {
        
        //0~9사이의 난수를 100개 발생시키고
        //각 숫자가 몇개씩 만들어졌는지를 그래프화 하시오
        //-------------------------------
        //0의 갯수 : ############ 12
        //1의 갯수 : ####### 7
        //....
        //9의 갯수 : ########## 10
        
        int[] arr = new int [10];
        Random rnd = new Random(); //한 프로젝트 전체에 렌덤장치를 설치

        for(int i = 0 ; i < 100 ; i++ ){//핵심코드
            int r = rnd.nextInt(10);
            arr[r]++; //인덱스 안의 수가 1씩 카운트
            }//for


        //i는 for문이 100바퀴 돌기위한 장치
        //arr [r] : r 은 인덱스 번호 
        // index 0   1   2    3   4   5   6   7   8   9
        // int  [0] [0] [0] [0] [0] [0] [0] [0] [0] [0]
        // ex) i=0, 난수 r=7
        // index  0   1   2   3   4   5   6   7   8   9
        // int  [0] [0] [0] [0] [0] [0] [0] [1] [0] [0]

        PrintGraph pg = new PrintGraph();
        pg.print(arr);

    }//main
}
