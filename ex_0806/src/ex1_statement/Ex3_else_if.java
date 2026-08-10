package ex1_statement;

public class Ex3_else_if {
    public static void main(String[] args) {
        
        //다중if문( else if )
        //여러개의 조건 비교가 필요한 경우 사용하는 if문

        //if( 조건식1 ){
        //  조건식1이 참일 때 실행되는 영역
        //}else if( 조건식2 ){
        // 조건식2가 참일 때 실행되는 영역
        //}

        int num = 75;
        String str = "";

        if( num >= 90 ){
            str = "A";
            //거짓
        }else if( num >= 80 ){
            str = "B";
            //거짓
        }else if ( num >= 70 ){
            str = "C";
            //참 : str은 C로 변경,  아래의 else if문은 인식되지 않는다
        }else if( num >= 60 ){
            str = "D";
            //D와 F는 출력되지 않는다
        }else if( num <= 59 ){
            str = "F";
        
        }else{
            //위의 조건식들이 모두 거짓일때 반드시 호출되는 영역
            //else 만 사용 = 조건문의 끝
            str = "알수없음";

        }
        System.out.println(str);

        //나이가 20이상 -> 성인요금
        //14이상 20미만 -> 청소년 요금
        //8이상 14미만 -> 어린이 요금
        //8미만 -> 유아요금

        int age = 15;
        String a = "";

        if( age >= 20 ){
            a = "성인요금";
        }else if( age >= 14 ){
            a = "청소년 요금";
        }else if( age >= 8 ){
            a = "어린이 요금";
        }else{
            a = "유아요금";
        }

        System.out.println(a);



    }//main
}//class end
