package db����;

import javax.swing.JOptionPane;

import Ŭ��������.memberDB;

public class ȸ������ó�� {

	public static void main(String[] args) throws Exception {
		
		//String sql = "update member set tel = ? where id = ?;
		String id =JOptionPane.showInputDialog("id�� �Է��ϼ���");
		String tel =JOptionPane.showInputDialog("tel�� �Է��ϼ���");
		
		
		MemberDB db = new MemberDB();
		db.update(id,tel);
		
		
		
		
		
		
	}

}
