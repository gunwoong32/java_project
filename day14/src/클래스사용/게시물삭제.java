package Ŭ�������;

import javax.swing.JOptionPane;

import Ŭ��������.BbsDB;

public class �Խù����� {

	public static void main(String[] args) {
		
		BbsDB db = new BbsDB();
		String title1 = JOptionPane.showInputDialog("������ �Խù��� �Է����ּ���");
		db.delete(title1);
		
	}

}