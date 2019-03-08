package chap15.home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SutdaCard {
    private int num;
    private boolean kwang;

    SutdaCard(int num, boolean kwang) {
        this.num = num;
        this.kwang = kwang;
    }

    private String isKwang() {
        if (this.kwang) {
            return "K";
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return this.num + this.isKwang();
    }
}

class SutdaDeck {
    private List<SutdaCard> sc_list;

    SutdaDeck() {
        sc_list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {

            if (i == 1 || i == 3 || i == 8) {
                sc_list.add(new SutdaCard(i, true));
            } else if (i >= 11) {
                sc_list.add(new SutdaCard(i - 10, false));
            } else {
                sc_list.add(new SutdaCard(i, false));
            }
        }
    }

    void shuffle() {
        Collections.shuffle(sc_list);
//        for (int i = 0; i < sc_list.size(); i++) {
//            SutdaCard sc_tmp;
//            int card1_index = (int) (Math.random() * 20); // 0~19
//            int card2_index = (int) (Math.random() * 20); // 0~19
//
//            sc_tmp = sc_list.get(card1_index);
//            sc_list.set(card1_index, sc_list.get(card2_index));
//            sc_list.set(card2_index, sc_tmp);
//        }
    }

    SutdaCard pick() {
        int index = (int) (Math.random() * 20); // 0~19

        return sc_list.get(index);
    }

    SutdaCard pick(int index) {
        return sc_list.get(index);
    }

    public String toString() {
        StringBuilder cardlist = new StringBuilder();
        for (int i = 0; i < sc_list.size(); i++) {
            cardlist.append(sc_list.get(i));
            if (i != sc_list.size() - 1) {
                cardlist.append(", ");
            }
        }

        return cardlist.toString();
    }
}

public class Test1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println("1:" + deck.toString());
        deck.shuffle();
        System.out.println("2:" + deck);
        System.out.println("3:" + deck.pick(0));
        System.out.println("4:" + deck.pick());
    }


}
