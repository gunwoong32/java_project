package 문제풀이;

import javax.swing.JOptionPane;

public class 테스트 {

	public static void main(String[] args) {

		String sn = JOptionPane.showInputDialog("사원번호를 입력하세요");
		char a = sn.charAt(0);
		char b = sn.charAt(1);		//입력되는 값이 저장되는 변수 sn에서 두번째 문자를 b에 저장한다.
		
		switch (a) {
		case '기':
			JOptionPane.showMessageDialog(null, "기획부이시군요");
			break;
		case '인':
			JOptionPane.showMessageDialog(null, "인사부이시군요");
			break;
		case '개':
			JOptionPane.showMessageDialog(null, "개발부이시군요");
			break;

		default:
			JOptionPane.showMessageDialog(null, "해당 직급이 없습니다.");
			break;
		}

		switch (b) {
		case '1':
		case '2':
			JOptionPane.showMessageDialog(null, "임원");
			break;
		case '3':
		case '4':
			JOptionPane.showMessageDialog(null, "부장");
			break;
		case '5':
		case '6':
			JOptionPane.showMessageDialog(null, "과장");
			break;

		default:
			JOptionPane.showMessageDialog(null, "없는 부서입니다");
			break;
		}

	}

}
