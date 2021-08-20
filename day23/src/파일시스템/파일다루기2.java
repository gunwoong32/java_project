package 파일시스템;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291");
		// jdk폴더 아래 몇 개가 있는지 프린트
		// 무엇이 있는지 프린트해보고, 폴더인지/파일인지 프린트

		File[] list = file.listFiles();
		System.out.println("jdk폴더 아래" + list.length + "개가 있다.");
		for (File file2 : list) {
			System.out.println(file2);
			System.out.println(file2.isDirectory());
		} // foreach
	}// main

}// class
