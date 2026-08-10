package ex1_multi_for;

public class Ex7_multiFor {
    public static void main(String[] args) {
        
        // 2 X 1 = 2  3 X 1 = 3  4 X 1= 4 .... 9 X 1 = 9
        // ....
        // 2 X 9 = 18 3 X 9 = 27 ............. 9 X 9 =81

        for(int i = 1; i <= 9; i++ ){

            for( int j = 2; j <=9; j++){

            System.out.print(j + " X " + i + " = " + (i*j) + "  " );
            
            }//inner

            System.out.println();

        }//outer

    }//main
}//class end
