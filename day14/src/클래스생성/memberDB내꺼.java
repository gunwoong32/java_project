package 클래스생성;

public class memberDB내꺼 {
	
	//DB연결2 클래스를 만들어보세요
	//본인의 프로젝트에서 사용할 메서드만 넣어서
	//클래스를 완성해보세요
	//	create read update delete
	
	String ip = "localhost";
	String port = "3306";
	String id ="root";
	String pw = "1234";
	String table = "member";
	
	public void create() {
		System.out.println("id 생성");
		System.out.println("pw 생성");
		System.out.println("이름 생성");
		System.out.println("생년월일 생성");
		System.out.println("이메일 생성");
		System.out.println("주소 생성");
		System.out.println("전화번호 생성");
	}
	
	public void read () {
		System.out.println("정보 저장하기");
	}

	
	public void update() {
		System.out.println("pw 수정");
	}
	public void delete() {
		System.out.println("탈퇴");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
