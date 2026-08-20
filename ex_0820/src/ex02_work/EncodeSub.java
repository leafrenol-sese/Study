package ex02_work;

public class EncodeSub {

    char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^',
                         '&', '*', '(', ')', '-', '_', '+', '=', '|',
                         '[', ']', '{', '}', ';', ':', ',', '.', '/' };

    char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y',
                        'u', 'i', 'o', 'p' };

    // String result = "";
    StringBuffer result = new StringBuffer();  //StringBuffer를 사용해서 아래 if문 출력값인 '.append( )'를 사용해야한다

            //"키보드 입력값 bc23"
    public String encoding(String str){

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            
            if( ch >= 'a' && ch <= 'z' ){ //ch의 입력값이 소문자 알파벳들이라면
                //     *아스킥코드: 98 - 97 == 1
                //    *i=0,ch=b   'b' -'a' == 1
                result.append( abcCode[ch - 'a'] ); //핵심코드
                //     *char[1] = '~' 따라서 b를 입력하면 '~'라는 출력값이 나온다

            }else if( ch >= '0' && ch <= '9'){ //ch의 입력값이 숫자라면
                //     *아스킥코드: 50 - 48 == 2
                //    *i=2,ch=2   '2' -'0' == 2
                result.append( numCode[ch - '0'] );
            }//if
                     
        }//for

            return result.toString();

    }//encoding()

}
