package 배열응용;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {

		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		final int MONEY = 10000; // 상수값 설정할때는 final int 대문자변수=값;

		while (true) {
			System.out.println("-----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(seat[i] + "  ");
			} // 1. UI만들기

			System.out.println();
			System.out.print("원하는 자리를 입력하세요>>");
			int num = sc.nextInt(); // 2. 입력받기

			if (num == -1) { // 3. -1이면 실행종료
				System.out.println("시스템을 종료합니다");
				int total = count * MONEY; // 6. 지불금액
				System.out.println("당신의 지불 금액은 " + total + "원");
				break; // -1이면 while문이 멈추도록 함.
			}

			if (seat[num] != 1) {// seat[num] == 0과 같음
				seat[num] = 1; // 4. 선택한 자리를 1로 바꾸어준다.
				System.out.println(num + "번 자리 예약되었습니다");
				count++;
				System.out.println(count + "자리 예약됨");
			} else { // 5. 이미 선택되어있으면[=1] 실행.
				System.out.println("이미 예약된 자리입니다");
				System.out.println("다른 자리를 선택해주세요");
			}

		} // while

	}// main

}// class
