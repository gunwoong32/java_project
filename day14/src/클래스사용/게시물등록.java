package 클래스사용;

import javax.swing.JOptionPane;

import 클래스생성.BbsDB;

public class 게시물등록 {

	public static void main(String[] args) {
		
		BbsDB db = new BbsDB();
		
		String title = JOptionPane.showInputDialog("게시물 제목을 입력하세요");
		String content = JOptionPane.showInputDialog("게시물 내용을 입력하세요");
		db.create(title, content);
		
		

		
		
		
	}

}
