package chap6;

/*
 * �簢�� Ŭ���� 3���� �����ϱ�
 * 1�� �簢�� : ���� 10, ���� 10�� �簢��
 * 2�� �簢�� : ���� 5, ���� 20�� �簢��
 * 3�� �簢�� : ���� 15, ���� 2�� �簢��
 * �� �����Ͽ�, ���� �簢���� ���̿� �ѷ��� ���ϴ� ���α׷� �ۼ��ϱ�
 */

class Rectangle {
	int width;
	int height;
	int nulbi;
	int dule;
	int serialno;
	static int cnt;
	public String toString() {
		return serialno + "����  �簢�� ���� : " + nulbi + ", �ѷ� : " + dule;
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
				System.out.println("���簢��");
			} else {
				System.out.println("���簢��");
			}
		}
	}

}
