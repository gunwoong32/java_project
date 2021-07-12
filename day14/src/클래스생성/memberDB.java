package 클래스생성;

import java.sql.DriverManager;

public class memberDB {
	//DB작업하는 class는 테이블당 한개씩
	//작업할 테이블이 2개이면, DB연결 클래스를 2개 만들어야 한다 
	//DB작업
	//1.DB,테이블 생성
	//2. 데이터 조작(CRUD : Create, Read, Update, Delete)
	
	String ip = "localhost";	//내 아이피가 자동으로 들어감
	String port = "3306";
	String user = "root";
	String pass = "1234";
	
	
	public void login(String id, String pw) {
		//회원가입시 사용한 id가 apple, pw는 1111
		if (id.equals("apple") && pw.equals("1111")) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패");
		}
	}

	public void create(String id,String pw, String name,String tel) throws Exception {
		//DB연결해야함.
		//1)네트워크 연결할 mqsql server 정보 : 주소와 연결(ip + port)
		//2)연결할 mysql server에 승인을 받아야한다. 필요한 정보 : id,pw
		
		System.out.println(ip + port + "에 연결되었습니다");
		System.out.println("회원가입 처리");
		System.out.println("도착한 id는 " + id);
		System.out.println("도착한 pw는 " + pw);
		System.out.println("도착한 name는 " + name);
		System.out.println("도착한 tel는 " + tel);
		//JAVA와 mysql과의 연결 순서가 정해져 있음.(JDBC프로그래밍,java db connectivity)
		//1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공!!!");
		
		//2. mysql server의 db와 연결하고 승인을 받자
		String url = "jdbc:mysql://" + ip + ":" + port + "/shoes";
					//jdbc:mysql://localhost:3306/shoes
		DriverManager.getConnection(url, user, pass);
		System.out.println("2. mySQL 서버 승인/연결 성공");
		
		//3. sql을 만들자
		
		//4. sql을 mysql server에 전송
		
		
	}
	public void read(String id) {
		System.out.println("회원가입 검색");
	}
	public void update() {
		System.out.println("회원가입 수정 처리");
	}
	public void delete(String id) {
		System.out.println("회원탈퇴 처리");
		System.out.println(id + "님의 탈퇴가 완료되었습니다.");
	}
	
	
}
