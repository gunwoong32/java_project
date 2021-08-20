package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class travelUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t6;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setBounds(512, 0, 672, 55);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(170, 121, 177, 55);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(170, 186, 177, 55);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("이름");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_2.setBounds(170, 251, 177, 55);
		f.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("생년월일");
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_3.setBounds(170, 316, 177, 55);
		f.getContentPane().add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("성별");
		lblNewLabel_1_4.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_4.setBounds(170, 381, 177, 55);
		f.getContentPane().add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("이메일");
		lblNewLabel_1_5.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_5.setBounds(170, 446, 177, 55);
		f.getContentPane().add(lblNewLabel_1_5);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBounds(359, 121, 592, 55);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(359, 186, 592, 55);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 30));
		t3.setColumns(10);
		t3.setBounds(359, 251, 592, 55);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 30));
		t4.setColumns(10);
		t4.setBounds(359, 316, 592, 55);
		f.getContentPane().add(t4);

		t5 = new JTextField();
		t5.setFont(new Font("굴림", Font.PLAIN, 30));
		t5.setColumns(10);
		t5.setBounds(359, 381, 592, 55);
		f.getContentPane().add(t5);

		t6 = new JTextField();
		t6.setFont(new Font("굴림", Font.PLAIN, 30));
		t6.setColumns(10);
		t6.setBounds(359, 446, 592, 55);
		f.getContentPane().add(t6);

		JButton btnNewButton = new JButton("생성");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1~t6에 입력된 값을 가져온다.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String dateBirth = t4.getText();
				String gender = t5.getText();
				String email = t6.getText();
				// 이것을 member테이블에 저장해야한다.
				travelDAO db = new travelDAO();
				try {
					int result = db.create(id, pw, name, dateBirth, gender, email);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				// 입력한 텍스트값을 공백으로 지워버리기.
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(354, 569, 191, 92);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = JOptionPane.showInputDialog("삭제할 아이디를 입력해주세요");

				travelDAO db = new travelDAO();
				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원 탈퇴하였습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "회원 탈퇴에 실패하였습니다.");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				e2.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");


			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1.setBounds(557, 569, 191, 92);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("아이디 입력");
				String pw = JOptionPane.showInputDialog("수정할 비밀번호입력");
				
				travelDAO db = new travelDAO();
				
				try {
					int result = db.update(id, pw);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "비밀번호를 수정하였습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "비밀번호 수정에 실패하였습니다.");
					}
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");

				
				
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_2.setBounds(760, 569, 191, 92);
		f.getContentPane().add(btnNewButton_2);

		f.setVisible(true);
	}
}
