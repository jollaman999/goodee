package chap11.home;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/*
* ������ ���� �������� �������� �ڵ带 �ϼ��Ͻÿ�
* [���]
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
			System.out.println("����̺� ��ΰ� �� �� �Ǿ����ϴ�!");
			return;
		}
		
		while (st.hasMoreTokens()) {
			FolderFile = st.nextToken();
			
			if (!Pattern.matches(folder_pattern, FolderFile)) {
				System.out.println("��θ��� �� �� �Ǿ����ϴ�!");
				return;
			}
		}
		
		if (!Pattern.matches(file_pattern, FolderFile)) {
			System.out.println("���ϸ��� �� �� �Ǿ����ϴ�!");
			return;
		}
		
		fileName = FolderFile;
		path = fullPath.substring(0, fullPath.length() - fileName.length());
		
		System.out.println("fullPath=" + fullPath);
		System.out.println("path=" + path);
		System.out.println("fileName=" + fileName);
	}
}