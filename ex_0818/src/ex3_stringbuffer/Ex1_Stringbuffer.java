package ex3_stringbuffer;

public class Ex1_Stringbuffer {
    public static void main(String[] args) {
        
        
        String str = "안녕"; //암시적 객체 생성
        str = "반갑습니다"; // str에 새로운 메모리가 씌워짐
        str += "!"; // "반갑습니다!"가 최종적으로 씌여지고 '안녕','반갑습니다' 는 쓰레기 메모리가 된다
        System.out.println(str);

        StringBuffer sb = new StringBuffer("안녕");
        sb.setLength(0); //sb안에 있던 "안녕"이  sb.setLength(0) <- "0"이라서 안의 내용물이 사라진다
        sb.append("반가워요"); //사라진 sb안에 "반가워요"가 추가
        sb.append("!!!"); //"반가워요"에 "!!!"를 추가, 쓰레기 메모리가 생성되지 않는다
        System.out.println(sb.toString());





    }//main
}
