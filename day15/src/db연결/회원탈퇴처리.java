package db연결;

import javax.swing.JOptionPane;

import 클래스생성.memberDB;

public class 회원탈퇴처리 {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("id를 입력하세요");

		MemberDB db = new MemberDB();
		db.delete(id);

	}

}
