package db����;

import javax.swing.JOptionPane;

import Ŭ��������.memberDB;

public class ȸ������ó�� {

	public static void main(String[] args) throws Exception {
		
		
		String id =JOptionPane.showInputDialog("id�� �Է��ϼ���");
		String pw =JOptionPane.showInputDialog("pw�� �Է��ϼ���");
		String name =JOptionPane.showInputDialog("name�� �Է��ϼ���");
		String tel =JOptionPane.showInputDialog("tel�� �Է��ϼ���");
		
		
		MemberDB db = new MemberDB();
		db.create(id, pw, name, tel);
		
		
		
		
		
		
	}

}
