package Ŭ�������;

import javax.swing.JOptionPane;

import Ŭ��������.memberDB;

public class ȸ���α���ó�� {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("���̵� �Է�");
		String pw = JOptionPane.showInputDialog("�н����� �Է�");
		
		memberDB db = new memberDB();
		db.login(id, pw);
	}


}
