package db연결;

import javax.swing.JOptionPane;

import 클래스생성.memberDB;

public class 회원가입처리 {

	public static void main(String[] args) throws Exception {
		
		
		String id =JOptionPane.showInputDialog("id를 입력하세요");
		String pw =JOptionPane.showInputDialog("pw를 입력하세요");
		String name =JOptionPane.showInputDialog("name를 입력하세요");
		String tel =JOptionPane.showInputDialog("tel를 입력하세요");
		
		
		MemberDB db = new MemberDB();
		db.create(id, pw, name, tel);
		
		
		
		
		
		
	}

}
