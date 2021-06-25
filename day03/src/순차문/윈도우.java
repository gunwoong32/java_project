package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(900, 500);
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		b1.setText("나는 첫번째 버튼");
		b2.setText("나는 두번째 버튼");
		f.add(b1);
		f.add(b2);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.setVisible(true); //마지막으로 이동
		
		
	}

}
