package 문제풀이;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 30));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("계산기");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setBounds(186, 23, 125, 57);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(59, 74, 115, 80);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(59, 165, 115, 80);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 33));
		t1.setBounds(174, 90, 220, 69);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 33));
		t2.setColumns(10);
		t2.setBounds(174, 176, 220, 69);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("+");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//더하기 기능
//				1. 입력
				String s1 = t1.getText(); //값 가져오기
				String s2 = t2.getText();
				
//				2. 처리
				int n1 = Integer.parseInt(s1); //
				int n2 = Integer.parseInt(s2);
				
				int result = n1 + n2;
				
				
//				3. 출력
//				
				System.out.println(result);
				
				
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 33));
		b1.setBounds(77, 294, 170, 69);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("-");
		b2.setFont(new Font("굴림", Font.PLAIN, 33));
		b2.setBounds(252, 294, 170, 69);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("*");
		b3.setFont(new Font("굴림", Font.PLAIN, 33));
		b3.setBounds(77, 373, 170, 69);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("/");
		b4.setFont(new Font("굴림", Font.PLAIN, 33));
		b4.setBounds(252, 373, 170, 69);
		f.getContentPane().add(b4);
		
		
		
		f.setVisible(true);
		
		
		
		
		
		
		
		
		
	}

}
