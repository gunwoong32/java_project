package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제2 {

	public static void main(String[] args) {

		while (true) {
			String num1 = JOptionPane.showInputDialog("사람1 숫자를 입력하세요");//입력
			String num2 = JOptionPane.showInputDialog("사람2 숫자를 입력하세요");
			int num3 = Integer.parseInt(num1);// string을 int로 바꾸어줌
			int num4 = Integer.parseInt(num2);
			if (num3 > num4) {
				JOptionPane.showMessageDialog(null, "첫번째 사람 승"); // 출력
				break;
			} else if (num3 < num4) {
				JOptionPane.showMessageDialog(null, "두번째 사람 승");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "동점");
				break;

			}

		}

// 		2. 게임을 계속하시겠습니까? (0:계속, 1: 종료)
//		무한루프 사용
//		첫번째 사람 숫자를 입력 :20
//		두번째 사람 숫자를 입력 : 10
//		첫번째 사람 승! // 더 큰 숫자를 낸 사람이 승리!
//		종료이면 게임을 stop!

	}// main

}// class
