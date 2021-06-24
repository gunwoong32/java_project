package 순차문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTree;

public class 윈도우연습 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(900, 500);
		
		
		JButton btnNewButton = new JButton("버튼2");
		btnNewButton.setBounds(254, 167, 223, 126);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("저도 누르셨군요");
				
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼1");
		btnNewButton_1.setBounds(254, 10, 223, 126);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저를 누르셨군요");
				JOptionPane.showMessageDialog(f, "저를 누르셨군요"); //f위에 메세지 뜨게
				
				
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(350, 303, 236, 65);
		textField.setFont(new Font("굴림", Font.PLAIN, 18));
		textField.setBackground(Color.ORANGE);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(143, 303, 172, 65);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 27));
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(143, 378, 172, 65);
		lblPw.setFont(new Font("굴림", Font.PLAIN, 27));
		f.getContentPane().add(lblPw);
		
		textField_1 = new JTextField();
		textField_1.setBounds(350, 378, 236, 65);
		textField_1.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.ORANGE);
		f.getContentPane().add(textField_1);
		f.setVisible(true); 
		
		
		
		
		
	}
}
