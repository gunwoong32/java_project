package 문제만들기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 문제만들기1 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("동물 울음소리");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 55));
		lblNewLabel.setBounds(210, 6, 314, 67);
		f.getContentPane().add(lblNewLabel);
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(b1,"멍");
			
			}
		});
		b1.setBounds(0, 85, 300, 300);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(b2, "삐약");
			}
		});
		b2.setBounds(301, 85, 300, 300);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("New button");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b2, "메에");
			}
		});
		b3.setBounds(598, 85, 300, 300);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("New button");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b2, "야옹");
			}
		});
		b4.setBounds(146, 384, 300, 300);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("New button");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b2, "음메");
			}
		});
		b5.setBounds(449, 384, 300, 300);
		f.getContentPane().add(b5);
		
		ImageIcon dog = new ImageIcon("e.png");
		ImageIcon cat = new ImageIcon("a.png");
		ImageIcon cow = new ImageIcon("b.png");
		ImageIcon pig = new ImageIcon("c.png");
		ImageIcon sheep = new ImageIcon("d.png");
		
		b1.setIcon(dog);
		b2.setIcon(cat);
		b3.setIcon(cow);
		b4.setIcon(pig);
		b5.setIcon(sheep);
		
		
		
		
		
		
		f.setVisible(true);
	}

}
