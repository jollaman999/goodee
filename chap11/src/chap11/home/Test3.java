package chap11.home;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/*
* 다음과 같은 실행결과가 나오도록 코드를 완성하시오
* [결과]
fullPath=c:/jdk11/work/PathSeparateTest.java
path=c:/jdk11/work
fileName=PathSeparateTest.java
*/
public class Test3 {
	public static void main(String[] args) {
		String fullPath = "c:/jdk11/work/PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		String FolderFile ="";
		
//		int index = fullPath.lastIndexOf("/");
//		path = fullPath.substring(0, index);
//		fileName = fullPath.substring(index + 1, fullPath.length());
		
		System.out.println(path);
		System.out.println(fileName);
		
		//String folderfile_pattern = "[^\\/:*?\"<>|]+";
		String drive_pattern = "[a-zA-Z]:";
		String folder_pattern = "[^\\/:*?\"<>|]+";
		String file_pattern = "[^\\/:*?\"<>|]+[.][jJ][aA][vV][aA]";
		
		StringTokenizer st = new StringTokenizer(fullPath, "/");
		
		String DriveName = st.nextToken();
		if (!Pattern.matches(drive_pattern, DriveName)) {
			System.out.println("드라이브 경로가 잘 못 되었습니다!");
			return;
		}
		
		while (st.hasMoreTokens()) {
			FolderFile = st.nextToken();
			
			if (!Pattern.matches(folder_pattern, FolderFile)) {
				System.out.println("경로명이 잘 못 되었습니다!");
				return;
			}
		}
		
		if (!Pattern.matches(file_pattern, FolderFile)) {
			System.out.println("파일명이 잘 못 되었습니다!");
			return;
		}
		
		fileName = FolderFile;
		path = fullPath.substring(0, fullPath.length() - fileName.length());
		
		System.out.println("fullPath=" + fullPath);
		System.out.println("path=" + path);
		System.out.println("fileName=" + fileName);
	}
}