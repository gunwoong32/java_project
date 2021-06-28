package 문제풀이;

import javax.swing.JOptionPane;

public class 입력처리출력문제풀이 {

	public static void main(String[] args) {

//		문제1 사형의 넓이.java
//		사각형의 넓이를 구하자
//		가로크기 33.3
//		세로크기 22.2
//		사각형의 넓이는 ****입니다.

		// 1. 입력

		String a = JOptionPane.showInputDialog("가로크기를 입력하세요");
		String b = JOptionPane.showInputDialog("세로크기를 입력하세요");

		// 2. 처리
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int result = a1 * b1;


		// 3. 출력
		JOptionPane.showMessageDialog(null, "사각형의 넓이는 " + result + "입니다.");

	}

}
