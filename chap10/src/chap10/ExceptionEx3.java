package chap10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println("작업 시작");
			System.out.println("작업 중");
			int num = 10 / 0;
			System.out.println("작업 완료");
		} catch (Exception e) {
			System.out.println("작업 중 오류 발생");
			return;
		} finally {
			System.out.println("작업 마무리 하기");
		}
		// 도달 불가
		System.out.println("프로그램 종료");
	}

}
