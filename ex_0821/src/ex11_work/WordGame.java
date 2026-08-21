package ex11_work;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordGame {

    // 1. 배열에서 랜덤으로 단어를 뽑는 메서드
    public static String randomWord(String[] strArr) {

        Random random = new Random();

        int index = random.nextInt(strArr.length);

        return strArr[index];
    }


    // 2. 단어의 문자를 랜덤으로 섞는 메서드
    public static String shuffleWord(String word) {

        char[] charArr = word.toCharArray();

        Random random = new Random();

        for (int i = charArr.length - 1; i > 0; i--) {

            int index = random.nextInt(i + 1);

            char temp = charArr[i];
            charArr[i] = charArr[index];
            charArr[index] = temp;
        }

        return new String(charArr);
    }


    // 3. 단어 맞추기 메서드
    public static void wordGame(String answer) {

        Scanner sc = new Scanner(System.in);

        String problem = shuffleWord(answer);

        System.out.println("문제 : " + problem);

        while (true) {

            System.out.print(">> ");
            String input = sc.nextLine();

            // 대소문자를 구분하지 않고 비교
            if (input.equalsIgnoreCase(answer)) {

                System.out.println(input + " 정답");
                break;

            } else {

                System.out.println(input + " 오답");
            }
        }
    }


    // 4. 프로그램 시작
    public static void main(String[] args) {

        String[] strArr = {
            "APPLE",
            "ORANGE",
            "HOPE",
            "VIEW"
        };

        String answer = randomWord(strArr);

        wordGame(answer);
    }
}