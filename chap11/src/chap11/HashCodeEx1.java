package chap11;

/*
 * Object 클래스의 멤버 : hashCode() 메서드
 * 	해쉬코드 : JVM이 객체 별로 부여하는 고유 ID 값임.
 */

class Hash {
	String name;
	int value;
	
	Hash(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Hash) {
			Hash h = (Hash)obj;
			return name.equals(h.name) && value == h.value;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + value;
	}
}

public class HashCodeEx1 {

	public static void main(String[] args) {
		Hash h1 = new Hash("홍길동", 10);
		Hash h2 = new Hash("홍길동", 10);
		System.out.println("h1 객체의 해쉬코드 : " + h1.hashCode());
		System.out.println("h2 객체의 해쉬코드 : " + h2.hashCode());
		// h2 = h1;
		System.out.println("h1 객체의 해쉬코드 : " + h1.hashCode());
		System.out.println("h2 객체의 해쉬코드 : " + h2.hashCode());
		System.out.println("h1 객체의 실제  해쉬코드 : " + System.identityHashCode(h1));
		System.out.println("h2 객체의 실제 해쉬코드 : " + System.identityHashCode(h2));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if (str1 == str2) {
			System.out.println("str1과 str2는 같은 객체다.");
		} else {
			System.out.println("str1과 str2는 다른 객체다.");
		}
		System.out.println("str1 객체의 해쉬코드 : " + str1.hashCode());
		System.out.println("str2 객체의 해쉬코드 : " + str2.hashCode());
		System.out.println("str1 객체의 실제  해쉬코드 : " + System.identityHashCode(str1));
		System.out.println("str2 객체의 실제 해쉬코드 : " + System.identityHashCode(str2));
		
		if (h1.equals(h2) && (h1.hashCode() == h2.hashCode())) {
			System.out.println("h1과 h2는 같은 객체다.");
		}
	}
}
