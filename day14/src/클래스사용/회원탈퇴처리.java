package Ŭ�������;

import javax.swing.JOptionPane;

import Ŭ��������.memberDB;

public class ȸ��Ż��ó�� {

	public static void main(String[] args) {

		memberDB db = new memberDB();
		
		String id = JOptionPane.showInputDialog("ȸ��Ż���� ���̵� �Է��ϼ���");
		db.delete(id);
		
		
		
		
		
	}
	
}
