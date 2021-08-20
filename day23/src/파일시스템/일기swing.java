package 파일시스템;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기swing {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 98, 205, 58);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(12, 186, 205, 58);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(12, 279, 205, 58);
		f.getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 30));
		textField.setBounds(229, 98, 328, 58);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(229, 186, 328, 58);
		f.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("굴림", Font.PLAIN, 30));
		textField_2.setColumns(10);
		textField_2.setBounds(229, 279, 328, 178);
		f.getContentPane().add(textField_2);

		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String day = textField.getText();
				String title = textField_1.getText();
				String content = textField_2.getText();
				try {
					FileWriter file = new FileWriter(title + ".txt");
					file.write(day + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close();
					System.out.println("일기 저장 완료");
				} catch (IOException e1) {
					System.out.println("저장하는 동안 에러가 발생함");
				}

			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(73, 473, 430, 78);
		f.getContentPane().add(btnNewButton);

		f.setVisible(true);
	}
}
