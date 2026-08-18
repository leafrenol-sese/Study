package ex_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {
        
        //겹치는 문자를 제거한다
        //문장 : abcab
        //결과 : abc
        
        Scanner sc = new Scanner(System.in);
        System.out.print("문장 : ");

        String in = sc.next();
        String res = "";
       
               //index:0  1  2  3  4  5  
        //in : aabcab [a][a][b][c][a][b]
        //res = "ab"
        //curr = 'b'
        //i = 2


        for (int i = 0; i < in.length(); i++ ){

            char curr = in.charAt(i); //

            if(res.indexOf(curr) == -1 ) // '-1 = 결과가 존재하지 않는다' //여기가 핵심
               res += curr;
        //1회차 : res="",i=0,curr=a -> if(res.indexOf(a) == -1 /번역: res안에 a가 존재하지 않으면 참, " "에 "a"를 더하라 ) => -1[참] ==> res = "a" 로 변경
        //2회차 : res="a",i=1,curr=a -> if("a".indexOf(a) == -1) => [거짓]으로 if문이 실행X, for문의 i++ => i=2로 변경
        //3회차 : res="a",i=2,curr=b -> if("a".indexOf(b) == -1 ) => [참]으로 if문 실행O, res+= curr == "a" += "b"가 되어, res = "ab"로 변경
        //4회차 : res="ab",i=3,curr=c -> if("ab".indexOf(c) == -1) => [참]으로 if문 실행O, res+= curr == "ab" += "c"가 되어, res = "abc"로 변경
        // .....
        //결과 : res == "abc" 로 출력
        
        }

        System.out.print( "결과 : " + res );

    }//main
}
