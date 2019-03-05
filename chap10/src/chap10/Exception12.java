package chap10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/*
 * 오버라이딩시 부모클래스의 메서드보다 자손 클래스 메서드의 예외처리는 좁은 범위만 가능하다.
 * 
 * 부모에서 선언한 예외 클래스	자손에서 선언된 예외 클래스
 * IOException	>	FileNotFoundException, UnknownHostException
 * 
 * FileNotFoundException, UnknownHostException 은 IOException 의 하위 클래스임.
 * 하위클래스 여러개는 상위클래스보다 좁은 범위다.
 */

class Parent {
	//void method() throws FileNotFoundException, UnknownHostException {
	void method() throws IOException {
		System.out.println("Parent method");
	}
}

class Child extends Parent {
	@Override
	//void method() throws IOException {
	void method() throws FileNotFoundException, UnknownHostException, IOException {
		System.out.println("Child method");
	}
}

public class Exception12 {
	public static void main(String[] args ) throws FileNotFoundException, UnknownHostException, IOException {
		Child c = new Child();
		c.method();
	}
}
