package 복습;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 순차문은 입력 -> 처리 -> 출력의 순서
		// 1. 입력 , 클릭하고 F2, 자동완성
		// 모든 입력데이터는 컴퓨터는 스트링으로 읽어온다
		// 숫자로 쓸지, 스트링으로 그대로 쓸지는 프로그래머가 결정한다.
		// 숫자로 쓸 경우, 숫자로 변환하는 처리를 해주어야 한다.
		// 변환하는 처리 기능을 가진 부품을 찾아서 쓰면 된다.
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇도일까요?");

		// 2. 처리, " 금요일은 27.5도"
		String result = today + "은 " + temp + "도";

		// 3. 출력
		JOptionPane.showMessageDialog(null, result + "입니다");
		System.out.println(result + "입니다");
		
		

	} // main

} // class
