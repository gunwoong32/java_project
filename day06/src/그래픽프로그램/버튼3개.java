package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼3개 {

	public static void main(String[] args) {

		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(UIManager.getColor("Button.background"));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null); //레이아웃을 지정하지않으면 내가 넣고 싶은 위치에 넣을 수 있다.
		
		JButton btnNewButton = new JButton("별10개");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < 10; i++) {
				System.out.print("*");
			}
			System.out.println();
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(130, 47, 233, 100);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("커피*5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < 5; i++) {
				System.out.print("커피");
			}
			System.out.println();     //아무것도 안넣으면 엔터처리
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(130, 148, 233, 100);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("커피*우유3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
				System.out.println();
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(130, 253, 233, 100);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("1:짱!");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i < 4; i++) {
					System.out.println(i + ": 짱!");
				}
				System.out.println();
			
			}
		});
		btnNewButton_2_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnNewButton_2_1.setBackground(Color.ORANGE);
		btnNewButton_2_1.setBounds(130, 352, 233, 100);
		f.getContentPane().add(btnNewButton_2_1);
		

		
		
		
		f.setVisible(true);
	}

}
