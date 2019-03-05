package chap7;

/*
 * Robot �� �������� DanceRobot, SingRobot, DrawRobot �� �ִ�
 * Robot Ŭ������ action �ż��带 ����� ������.
 * DanceRobot �� ���� ���� �߰�,
 * SingRobot �� ���� �뷡�� �θ���,
 * DrawRobot �� ���� �׸��� �׸���.
 * 
 * Robot Ŭ������ ������ ���� Robot �� ������ �޴´�.
 * action �޼���� �߻�޼��带 �����ϱ�.
 */

abstract class Robot {
	String type;
	Robot(String type) {
		this.type = type;
	}
	abstract void action();
}

class DanceRobot extends Robot {
	
	DanceRobot() {
		super("�� �κ�");
	}

	@Override
	void action() {
		System.out.println(type + " : ���� ���");
	}
	
}

class SingRobot extends Robot {
	
	SingRobot() {
		super("�� �κ�");
	}

	@Override
	void action() {
		System.out.println(type + " : �뷡�� �θ���");
	}
	
}

class DrawRobot extends Robot {
	
	DrawRobot() {
		super("��ο� �κ�");
	}

	@Override
	void action() {
		System.out.println(type + " : �׸��� �׸���");
	}
	
}

public class RobotEx1 {
	public static void main(String[] args) {
		Robot[] r = new Robot[3];
		r[0] = new DanceRobot();
		r[1] = new SingRobot();
		r[2] = new DrawRobot();
		for (Robot rb : r) {
			rb.action();
		}
	}
}
