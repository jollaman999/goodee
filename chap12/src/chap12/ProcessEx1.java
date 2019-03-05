package chap12;

/*
 * Process : OS 상태에서 실행중인 프로그램
 * Runtime.getRuntime().exec("Process") : OS 로 부터 프로세스의 실행 권한을 받기
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
