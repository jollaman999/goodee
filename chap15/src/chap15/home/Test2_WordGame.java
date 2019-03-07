package chap15.home;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/*
 * �ؽ�Ʈ ����� Ÿ�ڿ��� ���α׷� �ۼ��϶�
 * WordGenerator ��� �����带 �̿��Ͽ� 2�ʸ��� �ܾ �ϳ��� �߰���.
 * ����ڰ� �ܾ �Է��ϸ� Vector ���� ��ġ�ϴ� �ܾ Vector ���� �����ϵ��� ��.
 * ��� �����Ͱ� �����Ǹ� ���α׷� ����,
 */

public class Test2_WordGame {
    private Vector<String> words = new Vector<String>();

    public static void main(String[] args) {
        Test2_WordGame game = new Test2_WordGame();
        final int max_level = 5;

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("��������� �����մϴ�!!");
            System.out.print("�� �����ϼ��� : �ѱ���(0), ����(1) : ");

            int lang_selection;
            try {
                lang_selection = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("�� �� �� �����ϼ̽��ϴ�!\n");
                continue;
            }
            if (lang_selection != 0 && lang_selection != 1) {
                System.out.println("�� �� �� �����ϼ̽��ϴ�!\n");
                continue;
            }

            for (int level = 1; level <= max_level; level++) {
                System.out.println(level + "������ �����մϴ�!");
                if (game.play(lang_selection, level, max_level) == 1) {
                    System.out.println("������ �����մϴ�.");
                    return;
                }
                System.out.println(level + "���� Ŭ����!! ");
            }

            break;
        }

        System.out.println("���α׷� ����");
    }

    private int play(int lang_selection, int level, int max_level) {
        WordGenerator wg = new WordGenerator(lang_selection, level, max_level);
        wg.start();
        words.add(wg.data[(int)(Math.random() * wg.data.length)]);
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.print(words);
            System.out.println("  (�������� : 0)");
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
        String[] data_ko = {"���", "�ٳ���", "���ξ���", "������", "����", "ü��", "����",
                "����", "�޷�", "���ڳ�", "����", "����", "��", "������"};

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
