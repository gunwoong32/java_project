package 복습;

public class 산술계산심화 {

	public static void main(String[] args) {

		int x = 111;
		int y = 222;
		
		System.out.println("두 수의 합은 " + (x+y));
		System.out.println("두 수의 나눗셈은 " + (x/y)); // 몫만 나옴
		
	//	int sum = 333;
		int sum = x+y; //1. int sum 2. x+y 3. =
		int avg1 = sum / 2;
		System.out.println("평균은 " + avg1);
		//자바에서는 정수와 정수의 계산은 무조건 정수의 결과!!
		//자바에서는 하나라도 실수면 무조건 실수의 결과!
		
		double avg2 = sum /2.0;
		System.out.println("평균은 " + avg2);
		
		int count = 2;	// 
		avg2 = sum / (double) count; 
		// 캐스팅[=강제형변환] 이라고 부른다.
		// 변수가 둘다 int 일 때 cpu에서 바꾸는법
		// 캐스팅: cpu가 원래 데이터의 타입을 다른 타입으로 강제로 바꾸는 방법
		// 데이터 타입에 소괄호를 사용하여 바꾸어준다.
		
		System.out.println("평균은 " + avg2);
		
		
		
		
		
		
		
		
		
		
	}

}
