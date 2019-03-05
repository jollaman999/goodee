package chap7;

class Employee0 {
	boolean isjunggyu;
	String name;
	String buseo;
	
	Employee0 (boolean isjunggyu, String name, String buseo) {
		this.isjunggyu = isjunggyu;
		this.name = name;
		this.buseo = buseo;
	}
	
	String ShowJungGyu() {
		if (isjunggyu) {
			return "정규직";
		} else {
			return "비정규직";
		}
	}
}

class FormalEmployee0 extends Employee0 {
	String num;
	
	FormalEmployee0 (String num, String name, String buseo) {
		super(true, name, buseo);
		this.num = num;
	}
	
	public String toString() {
		return super.ShowJungGyu() + ", 직원번호 : " + num + ", 이름 : " + name + ", 부서 : " + buseo;
	}
}

class InFormalEmployee0 extends Employee0 {
	String expire;
	
	InFormalEmployee0 (String name, String expire) {
		super(false, name, "");
		this.expire = expire;
	}
	
	public String toString() {
		return super.ShowJungGyu() + ", 이름 : " + name + ", 계약 만료일 : " + expire;
	}
}

/*
 * 직원클래스 (Employee)
 * 		1. 변수 : 직원구분, 이름, 소속부서
 * 		2. 생성자 :
 * 			모든 멤버 변수를 매개변수로 가짐.
 * 정규직원 클래스 (FormalEmployee)
 * 		1. 직원번호
 * 		2. 생성자 :
 * 			직원번호, 이름, 소속부서를 매개변수로 가짐.
 * 비정규직원 (InformalEmployee)
 * 		1. 계약만료일
 * 		2. 생성자 :
 * 			이름, 계약 만료일을 매개변수로 가짐.
 */

public class EmployeeEx0 {

	public static void main(String[] args) {
		FormalEmployee0 fe = new FormalEmployee0("0001", "홍길동", "개발부");
		InFormalEmployee0 ife = new InFormalEmployee0("홍길동", "20191231");
		
		System.out.println(fe); // 구분, 직원번호, 이름, 부서 출력
		System.out.println(ife); // 구분, 이름, 계약 만료일 출력
	}

}
