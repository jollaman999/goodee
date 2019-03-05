package chap10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(10 / Integer.parseInt(args[0]));
			String s = null;
			System.out.println(s.trim());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요!");
		} catch (ArithmeticException e) {
			System.out.println("command 라인에 0은 입력하지 마세요!");
		} catch (NumberFormatException e) {
			System.out.println("command 라인에 숫자만 입력하세요!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("전산부로 연락 주세요!");
		}
	}

}
