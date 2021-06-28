package 문제풀이;

import java.sql.Date;

import javax.swing.JOptionPane;

public class 시간을구해보세요 {

	public static void main(String[] args) {

		//시간을 구해보세요
		//10시 전이면 굿모닝
		//15시 전이면 굿애프터눈
		//20시 전이면 굿이브닝
		//나머지는 굿나잇
		
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		
		
		if (hour<=10 && min<=0 && sec<=0) {
			System.out.println("굿모닝");
		} else if (hour<=15 && min<=0 && sec<=0) {
			System.out.println("굿애프터눈");
		}else if (hour<=20 && min<=0 && sec<=0) {
			System.out.println("굿이브닝");		
		}else {
			System.out.println("굿나잇");
		} 
		
		
		
		
		//요일이 토/일이면 쉬어요
		//나머지 요일이면 달려요.
		
				
				
				
		//월이 3-5이면 봄
//			6-8여름
//			9-11 가을
//			나머지는 겨울
		
		
		
		
		
		
		
		
		
		
	}

}
