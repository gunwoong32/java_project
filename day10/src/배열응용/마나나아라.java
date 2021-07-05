package 배열응용;

import java.util.Iterator;
import java.util.Scanner;

public class 마나나아라 {

	public static void main(String[] args) {
		int [] seat = new int[10];
		 Scanner sc = new Scanner(System.in);
		 int count=0;
		 final int MONEY =10000;

		 while (true) {
			System.out.println("--------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("--------");
			
			System.out.print("자리를 선택>>");
			int num = sc.nextInt();
			if (num == -1) {
				System.out.println("시스템을 종료");
				int total = count * MONEY;	
				System.out.println("지불금액은 " + total + "원");
			}
			
			
			if (seat[num] != 1) { //seat[num] == 0과 같음
				seat[num] = 1;
				System.out.println(num + "번 자리 예약완료");
			}
			else {
				System.out.println("이미 예약된 좌석입니다.");
				
			}
			
		}
		 
		
		
	}

}
