package chap6;

class ParamVal {
	int val;
}

public class ParameterEx1 {

	public static void main(String[] args) {
		ParamVal pv = new ParamVal();
		
		pv.val = 100;
		change1(pv.val);
		System.out.println("main => change1() 이후 : " + pv.val);
		change2(pv);
		System.out.println("main => change2() 이후 : " + pv.val);
	}

	private static void change1(int val) {
		val += 100;
		System.out.println("change1() : val = " + val);
	}
	
	private static void change2(ParamVal pv) {
		pv.val += 100;
		System.out.println("change(): val = " + pv.val);
	}
}
