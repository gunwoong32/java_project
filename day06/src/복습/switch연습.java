package 복습;

import java.util.Date;

public class switch연습 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int month = date.getMonth()+1;
		System.out.println(month);
		
		//정수[int],문자1,String만 가능, 실수x
		switch (month) {
		case 2:
			System.out.println("28일까지 있다.");
			break;
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지 있다.");
			break;

		default:
			System.out.println("30일까지있다.");
			break; // 생략가
		}
		
	}//main

}//class
