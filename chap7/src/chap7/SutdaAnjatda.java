package chap7;

// 카드 생성법
// 1부터 20까지 생성하고 1, 3, 8 을 광으로 표시한 후에
// 10 이상인 수들은 10 씩 다시 빼줌

class SutdaCard {
	int num;
	boolean kwang;
	
	String isKwang() {
		if (this.kwang) {
			return "K";
		} else {
			return "";
		}
	}
	
	String info() {
		return this.num + this.isKwang();
	}
}

class SutdaDeck {
	SutdaCard[] sc;
	
	SutdaDeck() {
		sc = new SutdaCard[20];
		for (int i = 0; i < sc.length; i++) {
			sc[i] = new SutdaCard();
			
			sc[i].num = i + 1;
			
			if (sc[i].num == 1 || sc[i].num == 3 || sc[i].num == 8) {
				sc[i].kwang = true;
				continue;
			}
			
			if (i + 1 > 10) {
				sc[i].num  = (i + 1) - 10;
			}
		}
	}
	
	void shuffle() {
		for (int i = 0; i < sc.length; i++) {
			SutdaCard sc_tmp = new SutdaCard();
			int card1_index = (int) (Math.random() * 20); // 0~19
			int card2_index = (int) (Math.random() * 20); // 0~19
			
			sc_tmp = sc[card1_index];
			sc[card1_index] = sc[card2_index];
			sc[card2_index] = sc_tmp;
		}
	}
	
	SutdaCard pick() {
		int index = (int) (Math.random() * 20); // 0~19
		
		return sc[index];
	}
	
	SutdaCard pick(int index) {
		return sc[index];
	}
	
	public String toString() {
		String cardlist = "";
		for (int i = 0; i < sc.length; i++) {
			cardlist += sc[i].info();
			if (i != sc.length - 1) {
				cardlist += ", ";
			}
		}
		
		return cardlist;
	}
}

public class SutdaAnjatda {

	public static void main(String[] args) {
		  SutdaDeck deck = new SutdaDeck();
		  System.out.println("1:" + deck);
		  deck.shuffle();
		  System.out.println("2:" + deck);
		  System.out.println("3:" + deck.pick(0).info());
		  System.out.println("4:" + deck.pick().info());
	}

}
