package chap7;

/*
 * Robot 의 종류에는 DanceRobot, SingRobot, DrawRobot 이 있다
 * Robot 클래스는 action 매서드를 멤버로 가진다.
 * DanceRobot 인 경우는 춤을 추고,
 * SingRobot 인 경우는 노래를 부르고,
 * DrawRobot 인 경우는 그림을 그린다.
 * 
 * Robot 클래스를 생성할 때는 Robot 의 종류를 받는다.
 * action 메서드는 추상메서드를 구현하기.
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
		super("댄스 로봇");
	}

	@Override
	void action() {
		System.out.println(type + " : 춤을 춘다");
	}
	
}

class SingRobot extends Robot {
	
	SingRobot() {
		super("싱 로봇");
	}

	@Override
	void action() {
		System.out.println(type + " : 노래를 부른다");
	}
	
}

class DrawRobot extends Robot {
	
	DrawRobot() {
		super("드로우 로봇");
	}

	@Override
	void action() {
		System.out.println(type + " : 그림을 그린다");
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
