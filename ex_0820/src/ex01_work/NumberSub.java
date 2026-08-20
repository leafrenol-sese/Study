package ex01_work;

public class NumberSub {
    
    public boolean isNumber( String str ){

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

        //아스킥코드 : 48          57
            if( ch < '0' || ch > '9' ){
                return false;
                //ex) "A"=65=ch => if(65 < 48 || 65 > 57) :전자는 felse지만 뒤는 true, if문 활성화 되면서 "felse"가 반환된다  
        
            }
        }//for

        return true; //숫자로만 이루어진 입력값은 true로 반환된다

    }//method

}
