package 새창데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("main창...!! 여기서 시작.");
		f.setSize(600, 600);
		Font font = new Font("궁서", Font.BOLD, 40);
		JButton b1 = new JButton("로그인처리");
		b1.setBounds(134, 175, 257, 55);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id1 = "root";
				String pw1 = "1234";
				String id2 = t1.getText();
				String pw2 = t2.getText();
				if (id1.equals(id2) && pw1.equals(pw2)) {
					새창3 w3 = new 새창3();
					w3.open3("완성");
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		JButton b2 = new JButton("결정!!");
		b2.setBounds(134, 480, 257, 55);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp =t3.getText();
				int temp2 =Integer.parseInt(temp);
				
					새창4 w4 = new 새창4();
					w4.open4(temp2);
			
				
				// f.setVisible(false);
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		b1.setFont(font);
		b2.setFont(font);
		b1.setBackground(Color.green);
		b2.setBackground(Color.yellow);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBounds(234, 25, 263, 65);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(234, 100, 263, 65);
		f.getContentPane().add(t2);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(54, 25, 168, 65);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(54, 100, 168, 65);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("오늘의 온도");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(54, 325, 168, 65);
		f.getContentPane().add(lblNewLabel_2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 30));
		t3.setColumns(10);
		t3.setBounds(234, 325, 263, 65);
		f.getContentPane().add(t3);

		f.setVisible(true);
	}

}
