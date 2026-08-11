package ex1_multi_for;

public class Ex7_multiFor {
    public static void main(String[] args) {
        

        // 시험문제 나옴! 

        // 2 X 1 = 2  3 X 1 = 3  4 X 1= 4 .... 9 X 1 = 9
        // ....
        // 2 X 9 = 18 3 X 9 = 27 ............. 9 X 9 =81

        for(int i = 1; i <= 9; i++ ){//고정값이 있는게 밖으로 ; 따라서 열

            for( int j = 2; j <=9; j++){ //지속적으로 변경이 많은것을 안으로 ; 따라서 단

            //System.out.print(j + " X " + i + " = " + (i*j) + "  " );
            System.out.printf("%d x %d = %d\t" , j , i , j*i );


            }//inner

            System.out.println();

        }//outer

    }//main
}//class end
