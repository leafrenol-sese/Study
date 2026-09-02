package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. 화투패 정보를 담는 클래스 (메인 클래스 외부 배치)
class Card {
    int month;       // 1 ~ 10월
    boolean isKwang; // 광 여부

    Card(int month, boolean isKwang) {
        this.month = month;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return month + (isKwang ? "광" : "");
    }
}

// 2. 메인 게임 실행 클래스
public class seutda2 {
    public static void main(String[] args) {

        // 1) 섯다 덱(20장) 구성
        List<Card> deck = new ArrayList<>();
        for (int m = 1; m <= 10; m++) {
            if (m == 1 || m == 3 || m == 8) {
                deck.add(new Card(m, true));  // 1광, 3광, 8광
                deck.add(new Card(m, false)); // 1피, 3피, 8피
            } else {
                deck.add(new Card(m, false)); // 피 2장
                deck.add(new Card(m, false));
            }
        }

        // 2) 덱 섞기 (중복 뽑기 방지)
        Collections.shuffle(deck);

        // 3) 패 2장 뽑기
        Card c1 = deck.get(0);
        Card c2 = deck.get(1);

        int rdNum1 = c1.month;
        boolean isKwang1 = c1.isKwang;

        int rdNum2 = c2.month;
        boolean isKwang2 = c2.isKwang;

        int sum = (rdNum1 + rdNum2) % 10;

        System.out.println("첫번째 패: " + c1);
        System.out.println("두번째 패: " + c2);

        // 4) 족보 판정 로직
        if ((rdNum1 == 3 && isKwang1 && rdNum2 == 8 && isKwang2) || 
            (rdNum1 == 8 && isKwang1 && rdNum2 == 3 && isKwang2)) {
            System.out.println("삼팔광땡");
        } 
        else if ((rdNum1 == 1 && isKwang1 && rdNum2 == 3 && isKwang2) || (rdNum1 == 3 && isKwang1 && rdNum2 == 1 && isKwang2) ||
                 (rdNum1 == 1 && isKwang1 && rdNum2 == 8 && isKwang2) || (rdNum1 == 8 && isKwang1 && rdNum2 == 1 && isKwang2)) {
            System.out.println("광땡");
        } 
        else if (rdNum1 == rdNum2) {
            String[] ttangNames = { "", "삥땡", "이땡", "삼땡", "사땡", "오땡", "육땡", "칠땡", "팔땡", "구땡", "장땡" };
            System.out.println(ttangNames[rdNum1] + " (" + sum + "끗)");
        } 
        else if ((rdNum1 == 1 && rdNum2 == 2) || (rdNum1 == 2 && rdNum2 == 1)) {
            System.out.println("알리 (" + sum + "끗)");

        } else if ((rdNum1 == 1 && rdNum2 == 4) || (rdNum1 == 4 && rdNum2 == 1)) {
            System.out.println("독사 (" + sum + "끗)");

        } else if ((rdNum1 == 1 && rdNum2 == 9) || (rdNum1 == 9 && rdNum2 == 1)) {
            System.out.println("구삥 (" + sum + "끗)");

        } else if ((rdNum1 == 1 && rdNum2 == 10) || (rdNum1 == 10 && rdNum2 == 1)) {
            System.out.println("장삥 (" + sum + "끗)");

        } else if ((rdNum1 == 10 && rdNum2 == 4) || (rdNum1 == 4 && rdNum2 == 10)) {
            System.out.println("장사 (" + sum + "끗)");

        } else if ((rdNum1 == 4 && rdNum2 == 6) || (rdNum1 == 6 && rdNum2 == 4)) {
            System.out.println("세륙 (" + sum + "끗)");
        
        } else {
            String[] kkutNames = { "망통", "한끗", "두끗", "세끗", "넷끗", "다섯끗", "여섯끗", "일곱끗", "여덟끗", "갑오" };
            System.out.println(kkutNames[sum] + " (" + sum + "끗)");
        }



    }//main
}