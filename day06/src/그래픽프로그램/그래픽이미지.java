package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 그래픽이미지 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		b1.setBounds(0, 0, 500, 100);
		f.getContentPane().add(b1);
		
		JLabel m = new JLabel("");
		m.setBounds(10, 111, 484, 355);
		f.getContentPane().add(m);
		
		ImageIcon dog1 = new ImageIcon("dog1.jpg");
		ImageIcon dog2 = new ImageIcon("dog2.jpg");
		b1.setIcon(dog1);
		m.setIcon(dog2);
		
		
		
		f.setVisible(true);
		
	}
}
