package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("");
		l1.setFont(new Font("굴림", Font.BOLD, 30));
		l1.setBounds(46, 41, 156, 40);
		f.getContentPane().add(l1);

		t1 = new JTextField();
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.RED);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(190, 41, 229, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(46, 107, 156, 40);
		f.getContentPane().add(lblNewLabel_1);

		t2 = new JTextField();
		t2.setForeground(Color.WHITE);
		t2.setBackground(Color.RED);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(190, 107, 229, 40);
		f.getContentPane().add(t2);

		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(46, 181, 156, 40);
		f.getContentPane().add(lblNewLabel_1_1);

		t3 = new JTextField();
		t3.setForeground(Color.WHITE);
		t3.setBackground(Color.RED);
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(190, 181, 229, 40);
		f.getContentPane().add(t3);

		JLabel lblNewLabel_1_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(46, 251, 156, 40);
		f.getContentPane().add(lblNewLabel_1_1_1);

		t4 = new JTextField();
		t4.setForeground(Color.WHITE);
		t4.setBackground(Color.RED);
		t4.setFont(new Font("굴림", Font.BOLD, 30));
		t4.setColumns(10);
		t4.setBounds(190, 251, 229, 40);
		f.getContentPane().add(t4);

		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1~t4에 입력된 값을 가지고 와야 함.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// member테이블에 저장하려고 함.
				// => 해결책, 우리가 원하는 기능을 가진 메소드를 가지고 있는
				//    부품을 찾아야 함.
				//    램에 가져다 놓으면 됨.
				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(id, pw, name, tel); //1
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					}else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//입력한거 지워버리자!
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(38, 314, 110, 105);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 아이디 입력");
				
				MemberDAO db = new MemberDAO();
				try {
					int result = db.delete(id);	//1
					if (result ==1) {
						JOptionPane.showMessageDialog(f, "탈퇴 성공");
					}
					else {
						JOptionPane.showMessageDialog(f, "탈퇴실패");
					}
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				//입력한거 지워버리자!
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setBounds(192, 314, 110, 105);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("수정");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id= JOptionPane.showInputDialog("아이디 입력");
				String tel= JOptionPane.showInputDialog("수정할 전화번호 입력");
				
				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(id, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "전화번호 수정 성공");
					}
					else {
						JOptionPane.showMessageDialog(f, "수정 실패");
					}
							
				} catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
					
				}
				
				//입력한거 지워버리자!
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1_1.setBackground(Color.CYAN);
		btnNewButton_1_1.setBounds(335, 314, 110, 105);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);
	}
}
