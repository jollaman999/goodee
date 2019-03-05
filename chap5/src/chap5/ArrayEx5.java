package chap5;

/*
 * Lotto ��ȣ �����ϱ�
 * 1~45 ������ �� �߿��� ���Ƿ� 6�� ������.
 */

public class ArrayEx5 {

	public static void main(String[] args) {
		// 1���� 45������ ���� ���� �迭 ����, �ʱ�ȭ
		int arr[] = new int[45];
		int lotto_select[] = new int[6];
		
		for (int i = 1; i <= 45; i++) {
			arr[i - 1] = i;
		}
		
		// �迭�� ���� ����
		// ���Ƿ� �迭�� �ε��� 2���� ã�Ƽ� �� ���� ���� �ٲٱ� => 1000�� ����
		for (int i = 0; i < 1000; i++) {
			int random1 = (int) (Math.random() * 45);
			int random2 = (int) (Math.random() * 45);
			int tmp;

			tmp = arr[random1];
			arr[random1] = arr[random2];
			arr[random2] = tmp;
		}
		
		for (int i = 0; i < lotto_select.length; i++) {
			lotto_select[i] = arr[i];
		}
		
		for (int i : lotto_select) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for (int i = 0; i < lotto_select.length; i++) {
			boolean change = false;
			for (int j = 0; j < lotto_select.length - i - 1; j++) {
				if (lotto_select[j] > lotto_select[j + 1]) {
					int tmp = lotto_select[j];
					lotto_select[j] = lotto_select[j + 1];
					lotto_select[j + 1] = tmp;
					change = true;
				}
			}
			
			for (int k : lotto_select) {
				System.out.print(k + ", ");
			}
			System.out.println();
			
			if (!change) {
				break;
			}
		}
		
//		for (int i : lotto_select) {
//			System.out.print(i + ", ");
//		}
//		System.out.println();
		
		/*
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45);
			if (arr[random] == 0) {
				i--;
				continue;
			}
			lotto_select[i] = arr[random];
			arr[random] = 0;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto_select[i]);
			if (i != 5) {
				System.out.print(", ");
			}
		}
		*/
	}

}
