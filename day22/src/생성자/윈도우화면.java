package 생성자;import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우화면 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("생성자 테스트");
		f.setSize(500, 500);
		
		JButton b = new JButton("나는 버튼");
		f.add(b);
		JButton b2 = new JButton("나는 버튼2");
		f.add(b2);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		b.setFont(font);
		b2.setFont(font);
		
		// 한번 쓸거면 이렇게 써도 상관없음
		//-> b.setFont(new Font("궁서", Font.BOLD, 50));
		
		f.setVisible(true);
		
		
		
		
	}

}
