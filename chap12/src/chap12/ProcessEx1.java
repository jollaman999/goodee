package chap12;

/*
 * Process : OS ���¿��� �������� ���α׷�
 * Runtime.getRuntime().exec("Process") : OS �� ���� ���μ����� ���� ������ �ޱ�
 */

public class ProcessEx1 {

	public static void main(String[] args) {
		try {
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			Process p3 = Runtime.getRuntime().exec("notepad.exe");
			
			if (p1.waitFor() == 0) {
				p2.destroy();
				p3.destroy();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
