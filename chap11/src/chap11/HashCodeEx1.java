package chap11;

/*
 * Object Ŭ������ ��� : hashCode() �޼���
 * 	�ؽ��ڵ� : JVM�� ��ü ���� �ο��ϴ� ���� ID ����.
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
		Hash h1 = new Hash("ȫ�浿", 10);
		Hash h2 = new Hash("ȫ�浿", 10);
		System.out.println("h1 ��ü�� �ؽ��ڵ� : " + h1.hashCode());
		System.out.println("h2 ��ü�� �ؽ��ڵ� : " + h2.hashCode());
		// h2 = h1;
		System.out.println("h1 ��ü�� �ؽ��ڵ� : " + h1.hashCode());
		System.out.println("h2 ��ü�� �ؽ��ڵ� : " + h2.hashCode());
		System.out.println("h1 ��ü�� ����  �ؽ��ڵ� : " + System.identityHashCode(h1));
		System.out.println("h2 ��ü�� ���� �ؽ��ڵ� : " + System.identityHashCode(h2));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if (str1 == str2) {
			System.out.println("str1�� str2�� ���� ��ü��.");
		} else {
			System.out.println("str1�� str2�� �ٸ� ��ü��.");
		}
		System.out.println("str1 ��ü�� �ؽ��ڵ� : " + str1.hashCode());
		System.out.println("str2 ��ü�� �ؽ��ڵ� : " + str2.hashCode());
		System.out.println("str1 ��ü�� ����  �ؽ��ڵ� : " + System.identityHashCode(str1));
		System.out.println("str2 ��ü�� ���� �ؽ��ڵ� : " + System.identityHashCode(str2));
		
		if (h1.equals(h2) && (h1.hashCode() == h2.hashCode())) {
			System.out.println("h1�� h2�� ���� ��ü��.");
		}
	}
}
