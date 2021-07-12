package 클래스생성;

public class 계산기 {
	public void order(String food) {
		System.out.println("당신이 주문한 것은 " + food + "입니다.");
	}
	// 사칙연산 계산기
	public void 더하기(int a, int b) {
		System.out.println("더하기 기능 처리 내용");
		int result = a + b;
		System.out.println("두 수의 합의 결과는 " + result)
		;
	}

	public void 빼기() {
		System.out.println("빼기 기능 처리 내용");
		}
	

	public void 곱하기(int price, int count) {
		System.out.println("곱하기 기능 처리 내용");
		int result = price * count;
		System.out.println("두 수의 곱의 결과는 " + result);
	}

	public void 나누기(double c, double d) {
		System.out.println("나누기 기능 처리 내용");
		double result = c/d;
	System.out.println("두 수의 나눗셈의 결과는 " + result);
	
	
	}

}
