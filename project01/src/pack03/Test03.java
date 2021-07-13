package pack03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		System.out.println("**********"); // 별10개 프린트

		Scanner sc = new Scanner(System.in); // 스캐너로 입력받기

		System.out.print("원하는 기호를 넣으세요>> "); // 프린트
		String a = sc.next(); // 입력받은값저장
		System.out.print("원하는 횟수를 넣으세요>> ");// 원하는횟수입력 프린트
		String b = sc.next(); // 횟수 입력값저장
		int c = Integer.parseInt(b); // b가 숫자이면 c에 저장
		for (int i = 0; i < c; i++) { // for문 c번반복
			System.out.print(a); // a값 출력
		}
		System.out.println();
		int count = 0; // count값 초기화
		while (true) { // while 문 true넣어주기
			
			System.out.print("1)증가,2)감소,3)종료를 선택해주세요.>> "); // 증가감소종료선택 프린트
			String d = sc.next(); // 입력값d에 저장
			int e = Integer.parseInt(d); // d가 정수이면 e에 저장
			System.out.println("카운트 : " + count); // 카운트 프린트

			if (e == 1) {			//e가1이면 count++
				count++;
			} else if (e == 2) {	//e가2이면 count--
				count--;

			}
			if (e == 3) {
				System.out.println("시스템을 종료합니다. 현재까지의 카운트는 " + count);
				break;		//3을 누르면 종료
			}

		}

	}

}
