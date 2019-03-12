package chap18.home;

/*
== Comment ==
C:\Windows 권한으로 속성 정보랑 똑같이 나오지 않는거 같아
권한있는 폴더로 테스트 했습니다.
 */

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        String filePath = "M:\\temp";
        File f1 = new File(filePath);
        String[] files = f1.list();

        int folder_sum = 0;
        int file_sum = 0;
        int size_sum = 0;

        if (files != null) {
            for (String f : files) {
                File f2 = new File(filePath, f);
                if (f2.isDirectory()) {
                    folder_sum++;
                } else {
                    file_sum++;
                    size_sum += f2.length();
                }
            }
        }

        System.out.println("하위 폴더 갯수 : " + folder_sum);
        System.out.println("하위 파일 갯수 : " + file_sum);
        System.out.printf("하위 파일의 총 크기 : %,d byte\n", size_sum);
    }
}
