package 배열응용;

import java.util.Scanner;

public class 연습1 {

	public static void main(String[] args) {
		
		int [] seat = new int [10];
		Scanner sc = new Scanner(System.in);
		int count =0;
		final int MONEY =10000;
		
		while (true) {
			System.out.println("--------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("--------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.print("좌석번호를 선택하세요>>");
			int seatNum = sc.nextInt();
			if (seatNum == -1) {
				System.out.println("시스템을 종료");
				int total = count * MONEY;
				System.out.println("총 " + count +"자리 " + total + "원 입니다");
				
				break;
				}
			
			if (seat[seatNum] != 1) {
				seat[seatNum] = 1;
				System.out.println(seatNum + "번 좌석을 선택했습니다");
				count++;
				System.out.println(count + "자리 예약됐습니다");
			} else {
				System.out.println("이미 선택된 좌석입니다");
			}
			
		}//while
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
