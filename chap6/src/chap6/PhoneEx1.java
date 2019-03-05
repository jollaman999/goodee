package chap6;

// 클래스 : 사용자 정의 자료형
class Phone {
	String color; // 멤버변수
	boolean power; // 멤버변수
	String no; // 멤버변수
	void power() { // 멤버 메서드
		power = !power;
	}
	void send (String no) { // 멤버 메서드
		System.out.println(no + "로 전화 송신 중~");
	}
	void receive(String no) { // 멤버 메서드
		System.out.println(no + "에서 전화 수신 중~");
	}
}

// 구동 클래스 : main 메서드를 가지고 있는 클래스
public class PhoneEx1 {

	public static void main(String[] args) {
		Phone p1 = new Phone(); // 객체화, 인스턴스화
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + ", " + p1.power + ", " + p1.no);
		p1.send("01012341234");
		p1.receive("01012341234");
		
		Phone p2;
		p2 = p1;
		System.out.println(p2.color + ", " + p2.power + ", " + p2.no);
	}

}
