package 자바기본;

import java.util.Scanner;

public class 기본입출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 콘솔과 자바프로그램간 입력스트림(입력용 연결통로)이 만들어진다.
		// 기본생성자란 클래스이름과 동일한 이름을 가진 파라메터없는 메서드
		// 객체 생성시 꼭 처리해야할 것이 있으면 생성자 메서드에 정의해서 꼭 실행하도록 하는 역할
		// 변수 초기화를 많이 함
		// 생성자는 대문자로 시작하는 유일한 메서드(클래스이름이 대문자)
		// Scanner 에러의 원인) 기본생성자가 없기 때문
		// 기본생성자는 자동으로 생성됨.
		// 단, 다른 파타메터 있는 생성자가 없는 경우에만!!!
		// 어떤 생성자들이 있는지 알고 싶은 경우
		// 1. 컨트롤 + 클릭을 해본다.
		// 2. 자동완성 기능을 사용해본다.
		// 변수에 넣어서, 30도 이상이면 너무 더워요.
		// 그 미만이면 괜찮아요

		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 온도는 몇도인가요? ");
			// cpu 구성:연산 + 제어 + 저장
			int temp = sc.nextInt(); // 모든 외부입력은 모두다 String-->int로 변환!
			// 실행순서 1. int temp 2. sc.nextInt() 3. =
			// 1:변수선언 //2:입력값을 스트링으로 받아서 정수로 변환
			// 3:변환한 정수값을 변수에 저장함.
			if (temp >= 30) {
				System.out.println("너무 더워요");
			} else {

				System.out.println("괜찮아요");
			}
		}

	}
}
