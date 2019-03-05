package chap11;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextInt(10) + ",");
		}
		System.out.println();
		
		Random random1 = new Random();
		Random random2 = new Random();
		
		random1.setSeed(0L);
		random2.setSeed(1L);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(random1.nextInt(10) + 1 + ",");
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(random2.nextInt(10) + ",");
		}
		
		System.out.println();
		
		// true 또는 false 를 랜덤으로 가져오기
		Random random3 = new Random();
		
		random3.setSeed(System.currentTimeMillis());
		for (int i = 0; i < 10; i++) {
			System.out.println(random3.nextBoolean() + ",");
		}
		System.out.println();
	}

}

