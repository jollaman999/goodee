package chap6;

/*
 * Student 클래스 구현하기
 * 멤버변수 : 이름 (name), 반(ban), 번호(no), 국어점수(kor), 영어점수(eng), 수학점수(math)
 * 			static int count
 * 멤버메서드
 *    1. int getTotal() : 학생별 점수의 총합을 리턴
 *    2. float getAverage() : 학생별 평균
 *    3. void info() : 번호, 이름, 반, 국어, 영어, 수학, 총점, 평균을 출력
 * 생성자
 *    1. 매개변수 (이름, 반, 번호) : 이름, 반, 번호는 초기화 하고 나머지는 0으로 초기화
 *    							번호는 count 로 자동 생성
 *    2. 매개변수 (이름, 반, 번호, 국어, 영어, 수학) : 이름, 반, 번호, 국어, 영어, 수학 초기화하기
 *    							번호는 count 로 자동 생성
 */

class Student {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	static int count;
	Student(String name, int ban) {
		this(name, ban, 0, 0, 0);
	}
	Student(String name, int ban, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		no = ++count;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return (float) getTotal() / 3;
	}
	void info() {
		System.out.println("번호 : " + no + ", 이름 : " + name + ", 반 : " + ban + ", 국어 : " + kor
							+ ", 영어 : " + eng + ", 수학  : " + math
							+ ", 총점 : " + getTotal() + ", 평균 : " + String.format("%.2f", getAverage()));
	}
}

public class StudentEx1 {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		student[0] = new Student("임수현", 3);
		student[0].info();
		student[1] = new Student("홍길동", 2, 97, 87, 45);
		student[1].info();
		student[2] = new Student("김삿갓", 2, 53, 64, 72);
		student[2].info();
	}

}
