package ex4_work;

public class CheckWord {
    // word[메인]를 받아서 반전시키고 다시 되돌려줄 checkword[서브]

    public String check( String str ) { //(  ) <-메인에서 String을 사용하니까 서브도 String을 받아야한다
        // public void ->  public String
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) { 
            rev += str.charAt(i);
        } // for

        return rev;

    }
}
