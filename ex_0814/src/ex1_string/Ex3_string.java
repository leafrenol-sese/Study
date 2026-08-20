package ex1_string;

public class Ex3_string {
    public static void main(String[] args) {
        
        String id = "920411-2344556";

        if( id.trim().length() < 14 || //문장해석 : 위의 아이디 번호의 앞뒤 공백을 제거[trim]하고 전체번호 수[length]가 14자리 미만 이거나
        id.trim().charAt(6) != '-'){ //id의 6번째 자리에 '-'이 아닐때, 참이면 "주민번호가 잘못됐어요"를 출력
        
            System.out.println("주민번호가 잘못됐어요");

        }else{
            String year = id.substring(0,2); //92
            String month = id.substring(2,4); //04
            String day = id.substring(4,6); //11
            char gender = id.charAt(7); //2

            System.out.printf("당신은 %s년 %s월 %s일에 태어난 " , year , month, day);

            if(gender == '1' || gender == '3'){

                System.out.println("남자입니다");

            }else{
                System.out.println("여자입니다");
            }

        }



    }//main
}
