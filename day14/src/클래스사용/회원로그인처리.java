package 클래스사용;

import javax.swing.JOptionPane;

import 클래스생성.memberDB;

public class 회원로그인처리 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		memberDB db = new memberDB();
		db.login(id, pw);
	}


}
