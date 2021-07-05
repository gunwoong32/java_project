package 배열응용;

import java.util.Scanner;

public class 극장예약시스템_연습 {

	public static void main(String[] args) {
		int[] seat = new int[10];//배열 선언
		Scanner sc = new Scanner(System.in); //키보드로 입력
		int count = 0;//
		final int MONEY = 10000;

		while (true) {
			System.out.println("-----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(seat[i] + "  ");
			}
			
			System.out.println();
			System.out.print("자리 번호를 입력하세요>>");
			int num = sc.nextInt();
			if (num == -1) {
				System.out.println("자리예약 시스템을 종료합니다");
				int total = count * MONEY;
				System.out.println("당신의 지불 금액은 " + total + "원");
				break;
			}
			if (seat[num] != 1) {
				seat[num] = 1;
				System.out.println(num + "번 자리 예약완료");
				count++;
				System.out.println(count + "자리 예약됨");
			} else {
				System.out.println("이미 예약된 자리입니다");
				System.out.println("다른 자리를 선택해주세요");
			}
			sc.close();
			
			int count2 = 0;
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 1) {
					count2++;
				}
			}
			System.out.println(count2 + "자리 예약됨");
			String sum = "";
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 1) {
					sum = sum + i + "번 ";

				}
			}
			System.out.println("예약된 자리 목록 " + sum);
		} // while

	}// main

}// class