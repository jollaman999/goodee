package chap11.home;

/*
  다음과 같은 실행 결과를 얻도록 Point3D클래스의 
  equals()메서드와 toString() 를 오버라이딩 하시오

[결과]
[1,2,3]
[1,2,3]
p1==p2?false
p1.equals(p2)?true
*/

class Point3D {
	int x;
	int y;
	int z;
	
	Point3D (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "," + z + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point3D)) {
			return false;
		}
			
		if (((Point3D)obj).x != this.x || 
				((Point3D)obj).y != this.y ||
				((Point3D)obj).z != this.z) {
			return false;
		}
		
		return true;
	}
}

public class Test2 {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
  
		System.out.println(p1);//[1,2,3]
		System.out.println(p2);//[1,2,3]
		System.out.println("p1==p2?" + (p1==p2));
		System.out.println("p1.equals(p2)?" 
                          + (p1.equals(p2)));
	}
}