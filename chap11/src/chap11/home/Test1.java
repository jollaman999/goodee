package chap11.home;

/*
 * 다음과 같은 실행 결과를 얻도록 SutdaCard클래스를 구현하시오
 * [결과]
 * c1=3K
 * c2=3K
 * c1.equals(c2) : true
 */

class SutdaCard {
	String card;
	
	SutdaCard (int n, boolean isKwang) {
		this.card = Integer.toString(n);
		if (isKwang) {
			this.card += "K";
		}
	}
	
	@Override
	public String toString() {
		return this.card;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof SutdaCard)) {
			return false;
		}
		
		if (((SutdaCard)o).card.equals(this.card)) {
			return true;
		} else {
			return false;
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);

		System.out.println("c1=" + c1);//3K
		System.out.println("c2=" + c2);//3K
		System.out.println("c1.equals(c2) : "  + c1.equals(c2));
	}
}
