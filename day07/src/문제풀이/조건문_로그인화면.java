package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 조건문_로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 800);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("아이디 : ");
		l1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		l1.setBounds(39, 120, 105, 72);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("패스워드 : ");
		l2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		l2.setBounds(39, 213, 131, 72);
		f.getContentPane().add(l2);

		JLabel result = new JLabel("결과보이는곳");
		result.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		result.setBounds(39, 505, 265, 72);
		f.getContentPane().add(result);

		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		t1.setBounds(205, 136, 258, 56);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(205, 213, 258, 56);
		f.getContentPane().add(t2);

		JButton b1 = new JButton("로그인 확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 누를 때마다 실행
				String s1 = t1.getText();
				String s2 = t2.getText();
				if (s1.equals("apple") && s2.equals("pass")) {
					result.setText("로그인 성공");
				} else {
					result.setText("로그인실패");
				}

			}
		});
		b1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		b1.setBounds(37, 349, 201, 104);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("지우기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		b2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		b2.setBounds(250, 349, 201, 104);
		f.getContentPane().add(b2);
		f.setVisible(true);

	}// main
}// class
