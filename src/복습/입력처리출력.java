package 복습;

import javax.swing.JOptionPane;

public class 입력처리출력 {

	public static void main(String[] args) {

//		1. 입력
		String hobby = showInputDialog("당신의 취미는?");
		String when = showInputDialog("언제 하시나?");
		String time = JOptionPane.showInputDialog("몇시간이나 하시나요?");
		
		
		
//		2. 처리
		String result = when + " 에 " + hobby +"을 하시는군요!";
		
		
//		3. 출력
		JOptionPane.showMessageDialog(null, result);
		
		
		
		

	} // main

	private static String showInputDialog(String string) {
		// TODO Auto-generated method stub
		return null;
	}

} // class
