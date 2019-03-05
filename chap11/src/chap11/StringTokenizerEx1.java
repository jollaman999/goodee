package chap11;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String text = "홀깅동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text, "/");
		
		int cnt = st.countTokens(); // 현재 남아있는 토큰의 갯수
		
		for (int i = 0; i < cnt; i++) {
			System.out.println(st.nextToken()); // 토큰 한개를 꺼내기
			System.out.println(st.countTokens());
		}
		
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println(st.countTokens());
			System.out.println(st.hasMoreTokens());
		}
		
		System.out.println();
		
		String[] tarr = text.split("/");
		for (int i = 0; i < tarr.length; i++) {
			System.out.println(tarr[i]);
		}
	}

}
