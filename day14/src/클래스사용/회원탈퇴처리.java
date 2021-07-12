package 클래스사용;

import javax.swing.JOptionPane;

import 클래스생성.memberDB;

public class 회원탈퇴처리 {

	public static void main(String[] args) {

		memberDB db = new memberDB();
		
		String id = JOptionPane.showInputDialog("회원탈퇴할 아이디를 입력하세요");
		db.delete(id);
		
		
		
		
		
	}
	
}
