package chap10;

import java.util.Scanner;

/*
 * Exception 클래스를 상속박아 MyException 을 만들 수 있다.
 */

class LoginFailException extends Exception {
	private int code;
	public LoginFailException(String msg) {
		super(msg);
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
}

public class ExceptionEx10 {

	public static void main(String[] args) {
		try {
			String id = "hongkd";
			String pw = "1234";
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디를 입력하세요");
			String inputid = scan.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String inputpw = scan.nextLine();
			if (id.equals(inputid) && pw.equals(inputpw)) {
				System.out.println("로그인 성공");
			} else if (!id.equals(inputid)) {
				LoginFailException e = new LoginFailException("아이디가 틀립니다!");
				e.setCode(100);
				throw e;
			} else {
				LoginFailException e = new LoginFailException("비밀번호가 틀립니다!");
				e.setCode(200);
				throw e;
			}
		} catch (LoginFailException e) {
			System.out.println("오류 코드 : " + e.getCode());
			System.out.println("오류 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
