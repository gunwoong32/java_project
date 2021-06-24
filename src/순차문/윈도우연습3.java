package 순차문;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JComboBox;

public class 윈도우연습3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {

//		JFrame f = new JFrame();
//		f.setSize(500, 500);
//		f.setVisible(true);            3줄필수
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.setBounds(33, 379, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.setBounds(173, 379, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("무");
		btnNewButton_2.setBounds(313, 379, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("<<<<<<<<<<오늘의 일기장을 시작합니다>>>>>>>>>>");
		lblNewLabel.setBounds(92, 148, 312, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("번호");
		lblNewLabel_1.setBounds(12, 180, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("날짜");
		lblNewLabel_2.setBounds(12, 218, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("제목");
		lblNewLabel_3.setBounds(12, 260, 57, 15);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("내용");
		lblNewLabel_4.setBounds(12, 303, 57, 15);
		f.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(61, 173, 349, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(61, 215, 349, 21);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(61, 257, 349, 21);
		f.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(61, 300, 349, 21);
		f.getContentPane().add(textField_3);
		
		f.setVisible(true);
		
		
		
	}

}
