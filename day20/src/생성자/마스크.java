package 생성자;

public class 마스크 {
	//속성 => '멤버변수' 라고 한다.
	//색,가격
						//멤버변수는 자동초기화된다.
	String color;		//참조형변수는 null
	int price;			//기본형변수는 0
	
	//객체 생성시 클래스 이름과 동일한 것이 있으면
	//자동 호출된다.
	//객체 생성시 넣어주어야 하는 초기값을 넣어주기 위해서 사용.
	//이것을 생성자 메서드, 생성자 라고 부릅니다.
	public 마스크(String c, int p) {		//매개변수 white가 c로 들어가고 2500이 p로 들어간다.
		color = c;
		price = p;
	}
	
	//동작 => '멤버메서드' 라고 한다.
	public void cover() {
		System.out.println("마스크를 쓰다.");
	}
	
	public String toString() {		//일일이 찍지말고 toString을 이용한다.
		return color + " " + price;
	
	}
}
