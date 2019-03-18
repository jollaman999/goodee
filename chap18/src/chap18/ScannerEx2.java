package chap18;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("score.txt"));
        int cnt = 0;
        int totalSum = 0;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            Scanner scan2 = new Scanner(line).useDelimiter(",");
            double sum = 0;
            int i = 0;
            String name = scan2.next();
            System.out.print(name + " : ");
            while(scan2.hasNextDouble()) {
                double score = scan2.nextDouble();
                sum += score;
                System.out.print(score + ", ");
                i++;
            }
            System.out.printf("sum=%.2f, avg=%.2f\n", sum, sum / i);
            totalSum += sum;
            cnt++;
        }
        System.out.println("촘 점수 : " + totalSum + ", 총 인원수 : " + cnt);
    }
}
