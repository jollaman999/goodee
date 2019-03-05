package chap11;

/*
 * Object 클래스의 equals 예제 : 내용 비교를 하기 위한 기능 가진 메서드
 * 				기본구현 : 동일 객체 여부를 리턴 == 연산자의 기능 동일
 * 				=> 내용 비교를 위해서는 오버라이딩 필요
 */

class Equal {
	int value;
	
	Equal(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equal) {
			Equal e = (Equal)obj;
			return this.value == e.value;
		}
		return false;
	}
	
}

public class EqualsEx1 {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(20);
		
		if (e1 == e2) {
			System.out.println("e1 객체와 e2 객체는 같은 객체다");
		} else {
			System.out.println("e1 객체와 e2 객체는 다른 객체다");
		}
		
		if (e1.equals(e2)) {
			System.out.println("e1 객체와 e2 객체는 같은 내용을 가진 객체다");
		} else {
			System.out.println("e1 객체와 e2 객체는 다른 내용을 가진 객체다");
		}
	}

}
