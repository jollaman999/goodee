package chap12;

import java.util.Scanner;
import java.util.Vector;

/*
 * �ؽ�Ʈ ����� Ÿ�ڿ��� ���α׷� �ۼ��Ͼ�
 * WordGenerator ��� �����带 �̿��Ͽ� 2�ʸ��� �ܾ �ϳ��� �߰���.
 * ����ڰ� �ܾ �Է��ϸ� Vector ���� ��ġ�ϴ� �ܾ Vector ���� �����ϵ��� ��.
 * ��� �����Ͱ� �����Ǹ� ���α׷� ����,
 */

public class WordGame {
	Vector<String> words = new Vector<String>();

	public static void main(String[] args) {
		WordGame game = new WordGame();
		game.play();
		System.out.println("���α׷� ����");
	}
	
	private void play() {
		WordGenerator wg = new WordGenerator();
		wg.start();
		words.add(wg.data[(int)(Math.random() * wg.data.length)]);
		while (true) {
			System.out.println(words);
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			
			int index = words.indexOf(input);
			
			if (index != -1) {
				words.remove(index);
			}
			
			if (words.size() == 0) {
				break;
			}
		}
	}
	
	class WordGenerator extends Thread {
		final int interval = 3 * 1000;
		String[] data = {"java", "sql", "jsp", "mybatis", "sitemesh",
				"mariadb", "xml", "json", "html", "spring", "jquery",
				"css", "hadoop"};
		
		WordGenerator() {
			setDaemon(true);
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
