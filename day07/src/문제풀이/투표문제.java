package 문제풀이;

import javax.swing.JOptionPane;

public class 투표문제 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		for (int i = 1; i <= 10; i++) {
			String vote = JOptionPane.showInputDialog("아이유는 1,유재석은 2,방탄은 3 중 투표해주세요");

			switch (vote) {
			case "1":
				a++;
				break;
			case "2":
				b++;
				break;
			case "3":
				c++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2,3 중에 선택해주세요");
				i--;
				break;
			}

		} // for
		System.out.println("아이유는 " + a + "명");
		System.out.println("유재석은 " + b + "명");
		System.out.println("방탄은 " + c + "명");
	}// main

}// class
