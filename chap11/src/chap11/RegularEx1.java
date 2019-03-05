package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "car", "combat",
				"count", "cTT", "data", "disk", "c", "ccc"};
		
		Pattern p = Pattern.compile("c[a-zA-Z]*");
		//Pattern p = Pattern.compile("[c][a-zA-Z0-9.;']*");
		for (String s : data) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println(s + ", ");
			}
		}
		System.out.println();
		
		String names = "È«±æµ¿,   ±è»ñ°«,ÀÌ¸ù·æ    ,         ¼ºÃáÇâ  ,      ÀÓ²©Á¤";
		String[] arr = names.split("\\s*,\\s*");
		
		for (String s : arr) {
			System.out.println(s);
		}
	}

}
