package chap6;

class Animal {
	String name;
	int age;
	void eat() {
		System.out.println("���ְ� �ȳ�");
	}
	public String toString() {
		return name + " : " + age + "��";
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "������";
		animal.age = 26;
		System.out.println(animal);
		animal.eat();
	}

}
