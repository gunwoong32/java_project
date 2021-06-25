package 순차문;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class 윈도우연습2 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.setBounds(80, 106, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.setBounds(204, 106, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(97, 290, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		f.setVisible(true);
		
		
		
		
		
	}

}
