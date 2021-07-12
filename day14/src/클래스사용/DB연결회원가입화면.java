package 클래스사용;

import 클래스생성.memberDB;

public class DB연결회원가입화면 {

	public static void main(String[] args) {
		
		memberDB db = new memberDB();
		//db.create();
		//db.delete();
		db.login("apple", "1111");
	}

}
