package chap6;

/*
 * �ΰ��� ������ ������ �����Ͽ� �ո��� 3�� ������ �¸��ϴ� ���α׷�
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
				System.out.print("�ո�");
				mycoin.front_sum++;
				break;
			case 1:
				System.out.print("�޸�");
				mycoin.front_sum = 0;
				break;
			}
			
			switch(youcoin.side) {
			case 0:
				System.out.print("           �ո�");
				youcoin.front_sum++;
				break;
			case 1:
				System.out.print("           �޸�");
				youcoin.front_sum = 0;
				break;
			}
			System.out.println();
			
			if (mycoin.front_sum == 3 && youcoin.front_sum == 3) {
				System.out.println("���º�!");
				break;
			} else if (mycoin.front_sum == 3) {
				System.out.println("mycoin �¸�!");
				break;
			} else if (youcoin.front_sum == 3) {
				System.out.println("youcoin �¸�!");
				break;
			}
			
			String str = new String("abc");
			str = new String("������");
			mycoin = new Coin_();
		}
	}

}
