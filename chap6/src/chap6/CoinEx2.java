package chap6;

/*
 * 두개의 동전을 던져서 연속하여 앞면이 3번 나오면 승리하는 프로그램
 */

class Coin_ {
	int front_sum;
	int side;
	void flip() {
		side = (int) (Math.random() * 2);
	}
}

public class CoinEx2 {

	public static void main(String[] args) {
		Coin_ mycoin = new Coin_();
		Coin_ youcoin = new Coin_();
		
		System.out.println("mycoin  youcoin");
		while (true) {
			mycoin.flip();
			youcoin.flip();
			
			switch(mycoin.side) {
			case 0:
				System.out.print("앞면");
				mycoin.front_sum++;
				break;
			case 1:
				System.out.print("뒷면");
				mycoin.front_sum = 0;
				break;
			}
			
			switch(youcoin.side) {
			case 0:
				System.out.print("           앞면");
				youcoin.front_sum++;
				break;
			case 1:
				System.out.print("           뒷면");
				youcoin.front_sum = 0;
				break;
			}
			System.out.println();
			
			if (mycoin.front_sum == 3 && youcoin.front_sum == 3) {
				System.out.println("무승부!");
				break;
			} else if (mycoin.front_sum == 3) {
				System.out.println("mycoin 승리!");
				break;
			} else if (youcoin.front_sum == 3) {
				System.out.println("youcoin 승리!");
				break;
			}
			
			String str = new String("abc");
			str = new String("가나다");
			mycoin = new Coin_();
		}
	}

}
