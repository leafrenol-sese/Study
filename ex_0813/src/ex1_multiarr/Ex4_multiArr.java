package ex1_multiarr;

public class Ex4_multiArr {
    public static void main(String[] args) {
        
        char[][] cArr = new char[2][]; //지금 x축이 지정되지 않아 오류
        cArr [0] = new char[2]; //1행 x축이 2열
        cArr [1] = new char[3]; //2행 x축이 3열 로 지정
        
        cArr[0][0] = '안';
        cArr[0][1] = '녕';

        cArr[1][0] = '하';
        cArr[1][1] = '세';
        cArr[1][2] = '요';
        
        for(int i = 0; i < cArr.length; i++){

            for(int j = 0; j < cArr[i].length; j++){

                System.out.print(cArr[i][j]);

            }//inner

            System.out.println();

        }//outer



    }//main
}//class end
