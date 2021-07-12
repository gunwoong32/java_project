package 클래스사용;

import javax.swing.JOptionPane;

import 클래스생성.BbsDB;

public class 게시물삭제 {

	public static void main(String[] args) {
		
		BbsDB db = new BbsDB();
		String title1 = JOptionPane.showInputDialog("삭제할 게시물을 입력해주세요");
		db.delete(title1);
		
	}

}