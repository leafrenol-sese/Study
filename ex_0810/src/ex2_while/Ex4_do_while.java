package ex2_while;

public class Ex4_do_while {
    public static void main(String[] args) {
        
        //do-while 문:
        //선 처리 후 비교
        
        int i = 11;

        do{ //1회 무조건 출력 후, 아래의 와일을 진행
            System.out.println(i);
            i++;

        }while( i <= 10 ); //11만 출력되고 종료


    }//main
}//class end
