package 클래스생성;

public class Car {
	//전역변수(global, 글로벌변수) <-> 로컬변수		차이점 :  자동초기화가 되고 안되고의 차이가 있다. 메모리의 위치도 다르다.
	//성질 => 변수로 만든다. 멤버변수
	//색(color) , 바퀴수(count)
	
	public String color;	//자동초기화 null
	public int count;	//자동초기화 0
	
	//동작 : 멤버메소드

	public void run() { //메소드
			//함수의 기능을 정의
			System.out.println("네 바퀴로 달리자");
	
	}

	public void up() {
		System.out.println("속도를 20씩 빨라진다.");
	}




}