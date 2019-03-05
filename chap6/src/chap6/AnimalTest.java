package chap6;

class Animal {
	String name;
	int age;
	void eat() {
		System.out.println("¸ÀÀÖ°Ô ³È³È");
	}
	public String toString() {
		return name + " : " + age + "»ì";
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "¿ø¼þÀÌ";
		animal.age = 26;
		System.out.println(animal);
		animal.eat();
	}

}
