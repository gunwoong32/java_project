package 생성자;

public class Phone {

	String color;
	int price;
	//자동완성을 이용하자  source속성에서 generate 이용하기
	public Phone(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [color=" + color + ", price=" + price + "]";
	}
	
//	//this는 이 클래스를 나타냄. this.color의 의미는 이 클래스의 바로 아래에 있는 color변수이다.
//	public Phone(String color, int price) {
//		this.color=color;
//		this.price=price;
//	}
//	
//	public String toString() {
//		return color + " : " + price;
		
	}
	

