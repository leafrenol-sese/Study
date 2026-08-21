package ex9_work;

public class WorkMain {

    public static void main(String[] args) {

        // 1~45사이의 중복되지 않는 난수 6새를 출력
        // 로또번호 생성기 만들기

        int[] lotto = new int[6];

        WorkSub ws = new WorkSub();
        ws.myLooto(lotto); // 얕은 복사때문에 따로 retrun하지 않아도 된다

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

    }// main
}
