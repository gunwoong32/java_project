package 자바기본;

public class 기본데이터 {

	public static void main(String[] args) {
		//기본 데이터 타입 : 정수, 실수, 문자, 논리 => 값이 들어감
		//참조형 데이터 타입 : 나머지 다, 배열, 클래스, ... => 주소가 들어감
		//정수 데이터
		byte b =100; //~-128~127, 1 byte = 8 bits
		//bit(비트) : 신호 하나, 1/0
		//@ : 0 , 1 (2개)
		//@@ : 00, 01, 10, 11 (4개)
		//@@@ : 000, 001, ..., 111 (8개) 
		//@@@@@@@@ : (256개) -128~127
		
		short s = 30000;		//2바이트 +-3만
		
		int i =100000000; 		//4바이트 +-21억
		long l = 2200000000L;	//8바이트 정수만 쓰면 int로 인식해서 뒤에 L을 적어준다.
		
		double d = 4.5678912345;//8바이트
		float f = 1.234456F;	//4바이트 소수점만 쓰면 double로 인식해서 뒤에 F를 적어준다.
		
		char c = 'a'; 			//2바이트
		System.out.println(c+1);
		
		boolean bo = true;	//true,false 1바이트
		
		
		
		
	}

}
