package chap18.home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2_0313 {
    public static void main(String[] args) throws IOException {
        System.out.println("출력할 파일명 입력");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String filename = stdin.readLine();
        System.out.println("출력할 라인 수 입력");
        int line = Integer.parseInt(stdin.readLine());
        BufferedReader fbr = new BufferedReader(new FileReader(filename));
        String msg ; // 파일의 내용을 한 줄 저장
        int prt = 0; // 출력라인
        while ((msg = fbr.readLine()) != null) {
            if (line <= prt)
                break;
            prt++;
            System.out.println(prt + ":" + msg);
        }
    }
}
