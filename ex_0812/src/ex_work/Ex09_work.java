package ex_work;

import java.util.Random;

public class Ex09_work {
    public static void main(String[] args) {

        // 1~45사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        // -----------------------
        // 17 2 45 27 9 11
        int[] lotto = new int[6];

        outer: for (int i = 0; i < lotto.length;) { //만일 i++이 여기 있고 중복이 생겼다면 이렇게 됨 => lotto = [17|'중복'|5|'중복'|9] '중복'은 공백이 된다

            lotto[i] = new Random().nextInt(45) + 1;
            // 중복값 비교
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    continue outer;//중복이 되어 continue를 만나면, 아래의 syso와i++은 생략하고 안쪽 for문이 아닌 outer:for문부터 다시 시작
                } // if

            } // inner

            System.out.print(lotto[i] + " ");
            i++;//출력 후, i를 증가, 가장 바깥쪽 for문부터 다시 반복
                //i++이 여기 있기 때문에 안쪽 int[]lotto의 인덱스 자리를 차지하지 않는다

        } // outer

    }// main
}// class end
