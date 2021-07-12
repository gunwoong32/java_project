package 클래스생성;

public class BbsDB {

	/* BbsDB.java
	 * crud에 해당하는 메서드를 정의하세요
	 * 1. 게시물등록.java를 만들어서 입력후에 BbsDB의 create메서드를 호출하여
	 * 	  전달된 값 프린트
	 * 2. 게시물삭제.java를 만들어서 입력후에 BbsDB의 delete메서드를 호출하여
	 *    삭제되었다고 프린트
	 */
	
	public void create(String title, String content ) {
		System.out.println("게시물 등록처리");
		System.out.println("게시물 제목은 " + title);
		System.out.println("게시물 내용은 " + content);
		
	}

	public void delete(String title1) {
		System.out.println("게시물 삭제처리");
		System.out.println(title1 + " 게시물을 삭제합니다.");
		
		}
		
	}
	
	
	
