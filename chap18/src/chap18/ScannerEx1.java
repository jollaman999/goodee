package chap18;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        String str = "Java and     Jsp and Spring and HTML and JavaScript";
        Scanner scan = new Scanner(str);

        // \\s : 공백을 의미, * : 공백 0개 이상
        scan.useDelimiter("\\s*and\\s*"); // 문자열 분리

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
    }
}
