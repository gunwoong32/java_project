package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 응용문제2 {

	public static void main(String[] args) {

		//나이를 입력 : 2
		//태어난 연도는 2020년 (date이용)
		
		//태어난 시각:10
		//오전에 태어나셨군요(오전,오후,밤,새)
		
		String age = JOptionPane.showInputDialog("나이를 입력하세요"); // 입력받기
		int a = Integer.parseInt(age);	//
		//자동 import ctrl + shift + o, f2
		Date date = new Date();
		int year = date.getYear()+1900;
		int hour = date.getHours()-12;
		System.out.println("태어난 연도는 " + (year + -a) + "입니다");
		
		String time = JOptionPane.showInputDialog("태어난 시각을 입력하세요");
		int b = Integer.parseInt(time);
		
		if (b >= 0 && b<=6) {
			System.out.println("새벽에 태어나셨군요");
		}else if (b >6 && b<=12 ) {
			System.out.println("오전에 태어나셨군요");
			
		}else if (b>12 && b<=18) {
			System.out.println("오후에 태어나셨군요");
		}else {
			System.out.println("저녁에 태어나셨군요");
		} {
		}
	}//main

}//class
