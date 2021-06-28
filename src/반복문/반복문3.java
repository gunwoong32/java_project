package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {

		// 시작값 : 3
		// 종료값 : 10
		// 3,4, ... ,10까지 프린트

		// 1. 입력
		String a = JOptionPane.showInputDialog("시작값을 입력하세요");

		int a1 = Integer.parseInt(a);

		while (a1 <= 10) {
			System.out.println(a1);
			a1++;
		}//for

	}//main

}//class
