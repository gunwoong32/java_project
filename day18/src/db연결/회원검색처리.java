package db연결;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class 회원검색처리 {

	public static void main(String[] args) throws Exception {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("New label");
		l1.setBounds(12, 10, 212, 230);
		l1.setFont(new Font("굴림", Font.PLAIN, 26));
		f.getContentPane().add(l1);

		String id = JOptionPane.showInputDialog("검색할 아이디 입력");
		MemberDAO db = new MemberDAO();
		String[] result = db.read(id);
		System.out.println("검색된 id는 " + result[0]);
		System.out.println("검색된 pw는 " + result[1]);
		System.out.println("검색된 name는 " + result[2]);
		System.out.println("검색된 tel는 " + result[3]);
		
		l1.setText(id);
		
		JLabel l2 = new JLabel((String) null);
		l2.setFont(new Font("굴림", Font.PLAIN, 26));
		l2.setBounds(260, 139, 212, 230);
		f.getContentPane().add(l2);
		
		
		//jop.mess
		//dao new
		//string[] result =db.read(id);
		//l1.settext
		
		
		// 만약 라벨에 넣을경우
		// l1.setText(result[0]);가 된다.
		// 버튼인경우
		// b1.setText(result[1]);가 된다.

		f.setVisible(true);
	}

}
