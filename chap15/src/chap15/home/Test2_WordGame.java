package chap15.home;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/*
 * 텍스트 기반의 타자연습 프로그램 작성하라
 * WordGenerator 라는 스레드를 이용하여 2초마다 단어를 하나씩 추가함.
 * 사용자가 단어를 입력하면 Vector 에서 일치하는 단어를 Vector 에서 삭제하도록 함.
 * 모든 데이터가 삭제되면 프로그램 종료,
 */

public class Test2_WordGame {
    private Vector<String> words = new Vector<String>();

    public static void main(String[] args) {
        Test2_WordGame game = new Test2_WordGame();
        final int max_level = 5;

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("워드게임을 시작합니다!!");
            System.out.print("언어를 선택하세요 : 한국어(0), 영어(1) : ");

            int lang_selection;
            try {
                lang_selection = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("언어를 잘 못 선택하셨습니다!\n");
                continue;
            }
            if (lang_selection != 0 && lang_selection != 1) {
                System.out.println("언어를 잘 못 선택하셨습니다!\n");
                continue;
            }

            for (int level = 1; level <= max_level; level++) {
                System.out.println(level + "레벨을 시작합니다!");
                if (game.play(lang_selection, level, max_level) == 1) {
                    System.out.println("게임을 종료합니다.");
                    return;
                }
                System.out.println(level + "레벨 클리어!! ");
            }

            break;
        }

        System.out.println("프로그램 종료");
    }

    private int play(int lang_selection, int level, int max_level) {
        WordGenerator wg = new WordGenerator(lang_selection, level, max_level);
        wg.start();
        words.add(wg.data[(int)(Math.random() * wg.data.length)]);
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.print(words);
            System.out.println("  (게임종료 : 0)");
            String input = scan.nextLine().trim();

            if (input.equals("0")) {
                return 1;
            }

            int index = words.indexOf(input);

            if (index != -1) {
                words.remove(index);
            }

            if (words.size() == 0) {
                return 0;
            }
        }
    }

    class WordGenerator extends Thread {
        int interval;

        String data[];
        String[] data_en = {"apple", "banana", "pineapple", "orange", "grape", "cherry", "strawberry",
                            "watermelon", "melon", "coconut", "mango", "lemon", "pear", "peach"};
        String[] data_ko = {"사과", "바나나", "파인애플", "오렌지", "포도", "체리", "딸기",
                "수박", "메론", "코코넛", "망고", "레몬", "배", "복숭아"};

        WordGenerator(int lang_selection, int level, int max_level) {
            setDaemon(true);
            switch(lang_selection) {
                case 0:
                    data = data_ko;
                    break;
                case 1:
                    data = data_en;
                    break;
                default:
                    break;
            }

            this.interval = 1000 * (max_level + 1 - level);
        }

        public void run() {
            while (true) {
                try {
                    sleep(interval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                words.add(data[(int)(Math.random() * data.length)]);
            }
        }
    }
}
