package chap9.home;

interface Beta {
	/* public abstract */ String testIt();
}

class Alpha implements Beta {
	@Override
	public String testIt() {
		return "Tested";
	}
}

public class InterfaceEx01 {
	
	static Beta getIt() {
		return new Alpha();
	}

	public static void main(String[] args) {
		// Alpha 클래스는 Beta interface 를 구현하였다.
		// 지금 여기 main 에서는 interface변수 B 에
		// Alpha 형식의 객체를 리턴하는 getIt() 를 대입하려 한다.
		//
		// getIt() 에서는 이미 객체화 된 new Alpha() 를 리턴해주고 있다.
		// 따라서 main 에서는 객체를 새로 생성할 필요는 없다.
		//
		// 대신에 Beta 인터페이스에 testIt() 의 추상 메소드를 구현해주면
		// main 에서의 b.testIt() 호출은 문제 없이 작동한다.
		// 또한, 인터페이스의 추상 메서드를 오버라이드 할 경우 접근제어자는 public 이어야 한다.
		//
		// 인터페이스 참조변수의 메소드 호출은 대입된 구현 객체를 따르므로
		// 여기서 b.testIt() 의 호출은 getIt() 의 객체형의 Alpha 이므로
		// Alpha 클래스의 testIt() 메서드가 정상적으로 호출된다.
		//
		// 결론 : Beta interface 에 testIt() 추상 메서드를 구현해주고
		// Alpha 클래스의 testIt() 메소드에 public 을 붙여주는 것으로 해결된다.
		Beta b = getIt();
		System.out.println(b.testIt());
	}

}
