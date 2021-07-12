package 문제만들기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 문제만들기2 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(800, 800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("랜덤 행운");
		lblNewLabel.setBounds(280, 0, 224, 113);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 56));
		f.getContentPane().add(lblNewLabel);
		
		JButton b1 = new JButton("당신의 행운의 숫자는?");
		b1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Random r = new Random(4);
				int num1 = r.nextInt(100);
			JOptionPane.showMessageDialog(b1, num1);
			
			
			}
		});
		b1.setBounds(29, 101, 216, 168);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("당신의 행운의 계절은?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b2.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		b2.setBounds(257, 101, 216, 168);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("당신의 행운의 요일은?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b3.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		b3.setBounds(485, 101, 216, 168);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("당신의 행운의 시간은?");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b4.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		b4.setBounds(147, 281, 216, 168);
		f.getContentPane().add(b4);
		
		
		
		
		
		
		f.setVisible(true);
		
	}
}
