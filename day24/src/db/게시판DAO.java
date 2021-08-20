package db;

import dto.게시판Bag;
import dto.회원Bag;

public class 게시판DAO {
	
	//메서드를 호출할 때 값을 전달하게 되는데 중간에 저장할 목적으로
	//매개체 역할을 해주는 변수, 메서드 안에 있는 변수들을 매개변수라고 합니다.
	//파라미터
	public void create(게시판Bag bag) {
		//메서드 안에서 만들어진 변수
		//변수는 변수선언할 때 만들어짐
		//선언의 위치가 변수의 생존범위를 결정함.
		//파라미터는 지역변수이다. 이 지역을 벗어나서는 사용불가능.
		//지역변수는 자동초기화안된다. 쓰레기값 들어있는 상태
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 title는 " + bag.getTitle());
		System.out.println("전달된 content는 " + bag.getContent());
		System.out.println("전달된 writer는 " + bag.getWriter());
	}
	//하나의 이름으로 메서드 이름을 쓸수있다.
	//입력값의 형태가 다양한 형태이어야 한다.
	//다형성=[오버로딩]
	public void read() {
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
	
}
