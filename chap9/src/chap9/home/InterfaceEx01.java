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
		// Alpha Ŭ������ Beta interface �� �����Ͽ���.
		// ���� ���� main ������ interface���� B ��
		// Alpha ������ ��ü�� �����ϴ� getIt() �� �����Ϸ� �Ѵ�.
		//
		// getIt() ������ �̹� ��üȭ �� new Alpha() �� �������ְ� �ִ�.
		// ���� main ������ ��ü�� ���� ������ �ʿ�� ����.
		//
		// ��ſ� Beta �������̽��� testIt() �� �߻� �޼ҵ带 �������ָ�
		// main ������ b.testIt() ȣ���� ���� ���� �۵��Ѵ�.
		// ����, �������̽��� �߻� �޼��带 �������̵� �� ��� ���������ڴ� public �̾�� �Ѵ�.
		//
		// �������̽� ���������� �޼ҵ� ȣ���� ���Ե� ���� ��ü�� �����Ƿ�
		// ���⼭ b.testIt() �� ȣ���� getIt() �� ��ü���� Alpha �̹Ƿ�
		// Alpha Ŭ������ testIt() �޼��尡 ���������� ȣ��ȴ�.
		//
		// ��� : Beta interface �� testIt() �߻� �޼��带 �������ְ�
		// Alpha Ŭ������ testIt() �޼ҵ忡 public �� �ٿ��ִ� ������ �ذ�ȴ�.
		Beta b = getIt();
		System.out.println(b.testIt());
	}

}
