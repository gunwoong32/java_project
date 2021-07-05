package 배열응용;

import java.util.Iterator;
import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {

		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		final int MONEY = 10000;
		
		
		while (true) {
			System.out.println("---------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("---------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			
			System.out.println();
			System.out.print("자리를 선택하세요(-1은 종료)>>");
			int seatNum = sc.nextInt();
			if (seatNum == -1) {
				System.out.println("시스템 종료");
				int total = count * MONEY;
				System.out.println("총 " + count + "자리 " + total + "원 입니다");
				break;
			}
			if (seat[seatNum] != 1) {
				seat[seatNum]=1;
				System.out.println(seatNum + "번 자리 선택하셨습니다.");
				count++;
			} else {
				System.out.println("이미 선택된 자리");
				
			} 
		}

	}

}