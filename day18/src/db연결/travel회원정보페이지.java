package db연결;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;

public class travel회원정보페이지 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(travel회원정보페이지.class.getResource("/db연결/뚱이.png")));
		lblNewLabel.setBounds(0, -122, 538, 905);
		f.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel("아이디");
		l1.setFont(new Font("굴림", Font.PLAIN, 30));
		l1.setBounds(537, 129, 177, 55);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("비밀번호");
		l2.setFont(new Font("굴림", Font.PLAIN, 30));
		l2.setBounds(537, 194, 177, 55);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("이름");
		l3.setFont(new Font("굴림", Font.PLAIN, 30));
		l3.setBounds(537, 259, 177, 55);
		f.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("생년월일");
		l4.setFont(new Font("굴림", Font.PLAIN, 30));
		l4.setBounds(537, 324, 177, 55);
		f.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("성별");
		l5.setFont(new Font("굴림", Font.PLAIN, 30));
		l5.setBounds(537, 389, 177, 55);
		f.getContentPane().add(l5);
		
		JLabel l6 = new JLabel("이메일");
		l6.setFont(new Font("굴림", Font.PLAIN, 30));
		l6.setBounds(537, 454, 177, 55);
		f.getContentPane().add(l6);
		
		JLabel lblNewLabel_1 = new JLabel("회원정보 페이지");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(695, 22, 489, 62);
		f.getContentPane().add(lblNewLabel_1);
		
		f.setVisible(true);
		
		
		
		
		
		
		
	}
}
