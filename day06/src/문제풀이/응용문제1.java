package 문제풀이;

import javax.swing.JOptionPane;

public class 응용문제1 {

	public static void main(String[] args) {

		// 1. 사원번호 입력 받기 : 기103
//			사원번호 중 첫 글자가 '기'인 경우 '기획부이군요'
//							 '인'인 경우 '인사부이군요'
//							 '개'인 경우 '개발부이군요'
		// 사원번호 중 두번째 글자가 '1'또는 '2'인 경우 '임원'
		// '3'인 경우 '부장'
//							  '4'또는 '5'인 경우 '평사원'
		// 나머지는 '해당 직급이 없음.'

		String sn = JOptionPane.showInputDialog("사원번호를 입력하세요");
		char a = sn.charAt(0);
		char b = sn.charAt(1);

		switch (a) {
		case '기':
			System.out.println("기획부이군요");
			break;
		case '인':
			System.out.println("인사부이군요");
			break;
		case '개':
			System.out.println("개발부이군요");
			break;

		default:

			break;
		}
		switch (b) {
		case '1':
		case '2':
			System.out.println("임원");
			break;
		case '3':
			System.out.println("부장");
			break;
		case '4':
		case '5':
			System.out.println("평사원");
		default:
			System.out.println("해당직급이 없음");
			break;
		}
	}

}
