package chap8;

/*
 * �������̽��� ��ü �����ϱ�
 */

interface Action {
	void action();
}

public class InterfaceEx6 {

	public static void main(String[] args) {
		Action a = new Action() {
			
			@Override
			public void action() {
				System.out.println("Action �������̽��� ��ü������ action() �޼���");
			}
		};
		a.action();
		a = new Action() {
			
			@Override
			public void action() {
				System.out.println("Action ��ü�� �ٸ� ��� �����ϱ�");
			}
		};
		a.action();
	}

}
