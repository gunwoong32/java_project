package Ŭ�������;

import javax.swing.JOptionPane;

import Ŭ��������.BbsDB;

public class �Խù���� {

	public static void main(String[] args) {
		
		BbsDB db = new BbsDB();
		
		String title = JOptionPane.showInputDialog("�Խù� ������ �Է��ϼ���");
		String content = JOptionPane.showInputDialog("�Խù� ������ �Է��ϼ���");
		db.create(title, content);
		
		

		
		
		
	}

}
