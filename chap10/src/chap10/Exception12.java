package chap10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/*
 * �������̵��� �θ�Ŭ������ �޼��庸�� �ڼ� Ŭ���� �޼����� ����ó���� ���� ������ �����ϴ�.
 * 
 * �θ𿡼� ������ ���� Ŭ����	�ڼտ��� ����� ���� Ŭ����
 * IOException	>	FileNotFoundException, UnknownHostException
 * 
 * FileNotFoundException, UnknownHostException �� IOException �� ���� Ŭ������.
 * ����Ŭ���� �������� ����Ŭ�������� ���� ������.
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
