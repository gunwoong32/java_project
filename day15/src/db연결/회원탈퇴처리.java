package db����;

import javax.swing.JOptionPane;

import Ŭ��������.memberDB;

public class ȸ��Ż��ó�� {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("id�� �Է��ϼ���");

		MemberDB db = new MemberDB();
		db.delete(id);

	}

}
