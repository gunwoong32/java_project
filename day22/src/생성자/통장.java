package 생성자;

public class 통장 {
	//멤버변수를 선언하기
	String name;
	String ssn;
	int money;
	
//	public 통장() {
//		//생성자 중에서 입력값이 없는 생성자를 '기본생성자'=[default constructor] 라고 부른다.
//		//다른 생성자가 하나도 없으면 자동 생성.
//		//묵시적으로 만들어졌음.
//	}
	
	@Override // 오버라이드 : 원래 메서드가 있던 것을 똑같은 형태로
			  // 다시 한번 정의해주면 원래 있었던 메서드가 다시 정의한 메서드로 덮어씌어짐. 
			  // 위로 올라타다
			  // [@ : annotation,표시 or at,-에]
			  // 오버라이드[재정의]
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	// 동작은 멤버메서드
	public void 입금하다() {
		System.out.println("입금하다.");
	}
	
}
