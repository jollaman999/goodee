package chap5;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		  int cnt = 0;
		  for(int i=1;i<=9;i++) {
		   for(int j=1;j<=9;j++) {
		    for(int k=1;k<=9;k++) {
		     if((i!=j)&&(i!=k)&&(j!=k)){
		      System.out.print(i);
		      System.out.print(j);
		      System.out.print(k);
		      cnt++;
		      System.out.print((cnt%7==0)?" ":",");
		     }
		    }
		    System.out.println();
		   }
		  }
	}

}
