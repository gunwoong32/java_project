package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 정리문제짬뽕 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {


		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setForeground(Color.BLACK);
		f.setSize(700, 900);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBackground(Color.ORANGE);
		t1.setForeground(Color.BLACK);
		t1.setBounds(375, 43, 255, 65);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(44, 43, 272, 65);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(44, 245, 272, 65);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어점수");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(44, 511, 272, 65);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setBackground(Color.PINK);
		t2.setForeground(Color.BLACK);
		t2.setColumns(10);
		t2.setBounds(375, 245, 255, 65);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("수학점수");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(44, 622, 272, 65);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 30));
		t3.setBackground(Color.CYAN);
		t3.setForeground(Color.BLACK);
		t3.setColumns(10);
		t3.setBounds(375, 511, 255, 65);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 30));
		t4.setBackground(Color.CYAN);
		t4.setForeground(Color.BLACK);
		t4.setColumns(10);
		t4.setBounds(375, 622, 255, 65);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//버튼을 클릭했을 때 자동으로 이 함수가 실행
				//버튼을 클릭했을 때 처리내용을 넣으면 된다.
				String s1 = t1.getText(); // 
				if (s1.equals("아메리카노") || s1.equals("라떼") || s1.equals("홍차")) {
					System.out.println("카페");
				} else if (s1.equals("육개장")) {
					System.out.println("식당");
				} else if (s1.equals("햄버거")) {
					System.out.println("버거킹");
				}
				else {
					System.out.println("집이나 가죠");
				}
				
				}
			
		});
		btnNewButton.setBounds(44, 136, 586, 75);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int age = Integer.parseInt(s2);
				int result = age + 1;
				System.out.println("당신의 내년 나이는 " + result);
				
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1.setBounds(44, 346, 586, 75);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				
				int la = Integer.parseInt(s3);
				int ma = Integer.parseInt(s4);
				
				
				Double result = (la + ma) / 2.0;
				
				System.out.println("당신의 평균점수는 " + result);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_2.setBounds(44, 704, 586, 75);
		f.getContentPane().add(btnNewButton_2);

		
		
		
		f.setVisible(true);
		
		
		
		
	}
}
