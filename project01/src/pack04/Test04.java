package pack04;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test04 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("계산기");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel.setBounds(154, 0, 116, 74);
		f.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel("숫자1");
		l1.setFont(new Font("굴림", Font.PLAIN, 23));
		l1.setBounds(48, 79, 73, 82);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("숫자1");
		l2.setFont(new Font("굴림", Font.PLAIN, 23));
		l2.setBounds(48, 174, 73, 82);
		f.getContentPane().add(l2);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setBounds(154, 84, 202, 74);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.YELLOW);
		t2.setBounds(154, 176, 202, 80);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton b1 = new JButton("더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = t1.getText(); //입력. 값 가져오기
				String s2 = t2.getText();
				

				int n1 = Integer.parseInt(s1); //처리.  입력값 n1에 저장
				int n2 = Integer.parseInt(s2);
				
				int result = n1 + n2;
				
				
				System.out.println(result);		//출력.
				
				
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 31));
		b1.setBounds(44, 303, 173, 103);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("빼기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = t1.getText(); //입력. 값 가져오기
				String s2 = t2.getText();
				

				int n1 = Integer.parseInt(s1); //처리.  입력값 n1에 저장
				int n2 = Integer.parseInt(s2);
				
				int result = n1 - n2;
				
				
				System.out.println(result);		//출력.
				
				
				
				
				
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 31));
		b2.setBounds(229, 303, 173, 103);
		f.getContentPane().add(b2);
		
		f.setVisible(true);
		
		
		
		
		
		
		
		
		
		
	}
}
