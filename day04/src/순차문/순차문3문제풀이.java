package 순차문;

import javax.swing.JOptionPane;

public class 순차문3문제풀이 {

	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("숫자1 입력");
		String y = JOptionPane.showInputDialog("숫자2 입력");
		
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		int result = x1 - y1;
		
		JOptionPane.showMessageDialog(null,  x + " - " + y + "는 " + result + "입니다.");
		
		
		
		
		
		
		
		
		
	}

}
