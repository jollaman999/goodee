package chap7;

abstract class Employee {
	String type; // 직원구분
	String name; // 이름
	
	Employee(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	abstract int getPay(); // 급여
}

class FormalEmployee extends Employee { // 정규직원
	String empNo; // 직원번호
	String position; // 직급
	int salary; // 연봉
	
	FormalEmployee(String name, String empNo, int salary, String position) {
		super("정규", name);
		
		this.empNo = empNo;
		this.salary = salary;
		this.position = position;
	}
	
	@Override
	int getPay() {
		return salary / 12;
	}
}

class InformalEmployee extends Employee { // 비정규직원
	String expireDate; // 계약만료일
	int primaryPay; // 기본임금
	
	InformalEmployee(String name, String expireDate, int primaryPay) {
		super("비정규", name);
		
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	
	InformalEmployee(String type, String name, String expireDate, int primaryPay) {
		super(type, name);
		
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	
	@Override
	int getPay() {
		return this.primaryPay;
	}
}

class TempEmployee extends InformalEmployee { // 임시직원
	int timePay; // 시간당 임금
	int empTime; // 근무시간
	
	TempEmployee(String name, String expireDate, int primaryPay, int empTime, int timePay) {
		super("임시", name, expireDate, primaryPay);
		
		this.empTime = empTime;
		this.timePay = timePay;
	}
	
	@Override
	int getPay() {
		return this.primaryPay + (this.timePay * this.empTime);
	}
}

class InternEmployee extends InformalEmployee { // 인턴 사원
	double payRate; // 임금지급율
	
	InternEmployee(String name, String expireDate, int primaryPay, double payRate) {
		super("인턴", name, expireDate, primaryPay);
		
		this.payRate = payRate;
	}
	
	@Override
	int getPay() {
		return (int) (this.primaryPay * this.payRate);
	}
}

public class EmployeeEx1 {

	public static void main(String[] args) {
		Employee[] emps = new Employee[4];
		
		emps[0] = new FormalEmployee("김정규", "1", 5000, "과장");
		emps[1] = new InformalEmployee("이비정", "20191231", 1000);
		emps[2] = new TempEmployee("박임시", "20191231", 0, 1, 50);
		emps[3] = new InternEmployee("김인턴", "20191231", 2000, 0.8f);
		
		for (Employee e : emps) {
			System.out.println(e.type + "사원 :" + e.name + "의 급여 : " + e.getPay());
		}
	}

}
