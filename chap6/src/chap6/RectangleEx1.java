package chap6;

/*
 * 사각형 클래스 3개를 생성하기
 * 1번 사각형 : 가로 10, 세로 10인 사각형
 * 2번 사각형 : 가로 5, 세로 20인 사각형
 * 3번 사각형 : 가로 15, 세로 2인 사각형
 * 을 생성하여, 각각 사각형의 넓이와 둘레를 구하는 프로그램 작성하기
 */

class Rectangle {
	int width;
	int height;
	int nulbi;
	int dule;
	int serialno;
	static int cnt;
	public String toString() {
		return serialno + "번쨰  사각형 넓이 : " + nulbi + ", 둘레 : " + dule;
	}
	boolean isSquare() {
		return width == height;
	}
}

public class RectangleEx1 {

	public static void main(String[] args) {
		Rectangle[] rarr = new Rectangle[3];
		
		for (int i = 0; i < rarr.length; i++) {
			rarr[i] = new Rectangle();
		}
		
		rarr[0].width = 10;
		rarr[0].height = 10;
		
		rarr[1].width = 5;
		rarr[1].height = 20;
		
		rarr[2].width = 15;
		rarr[2].height = 2;
		
		for (int i = 0; i < rarr.length; i++) {
			rarr[i].nulbi = rarr[i].width * rarr[i].height;
			rarr[i].dule = (rarr[i].width + rarr[i].height) * 2;
			rarr[i].serialno = ++Rectangle.cnt;
		}
		
		for (Rectangle r : rarr) {
			System.out.println(r);
			if (r.isSquare()) {
				System.out.println("정사각형");
			} else {
				System.out.println("직사각형");
			}
		}
	}

}
