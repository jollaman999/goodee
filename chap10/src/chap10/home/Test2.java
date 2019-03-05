package chap10.home;

public class Test2 {
	
	static void method(boolean b) {
		try {
			System.out.print(1);
			if (b) {
				throw new ArithmeticException();
			}
			System.out.print(2);
		} catch (RuntimeException e) {
			System.out.print(3);
			return; // finally 를 실행하고 끝난다.
		} catch (Exception e) {
			System.out.print(4);
			return;
		} finally {
			System.out.print(5);
		}
		System.out.print(6);
	}

	public static void main(String[] args) {
		//
		// 제일 먼저 1이 표시 되고
		// true 이므로 ArithmeticException 이 실행되고
		// ArithmeticException 은 RuntimeException 에 속하여
		// 3이 표시된다.
		// 마지막으로 finally 의 5가 표시되고 종료
		method(true);
		
		//
		// 제일 먼저 1이 표시 되고
		// false 이므로 아랫문장인 2가 표시되고
		// 따로 Exception 걸리지 않아 finally 의 5가 표시되고
		// 따로 Exception 걸린게 없으므로 6을 표시하고 종료
		method(false);
	}

}
