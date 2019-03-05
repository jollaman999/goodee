package chap7;

public class BikeEx3 {

	public static void main(String[] args) {
		Bike2 b = new AutoBike2(2);

		// instanceof ������ : ���������� ��ü���� ���� Ȯ��
		if (b instanceof Bike2) {
			System.out.println("b ���������� �����ϴ� ��ü�� Bike2 ��ü��");
		}
		if (b instanceof AutoBike2) {
			System.out.println("b ���������� �����ϴ� ��ü�� AutoBike2 ��ü��");
			AutoBike2 ab = (AutoBike2) b;
			ab.power();
			ab.drive();
		}
		if (b instanceof Object) {
			System.out.println("b ���������� �����ϴ� ��ü�� Object ��ü��");
		}
		String s = "";
		if (s instanceof Object) {
			System.out.println("s ���������� �����ϴ� ��ü�� Object ��ü��");
		}
	}

}
