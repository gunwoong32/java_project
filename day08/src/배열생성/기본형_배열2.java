package 배열생성;

public class 기본형_배열2 {

	public static void main(String[] args) {
		// int[] : int 배열을 가리키는 주소가 들어간다는 의미
		// s : heap영역에 할당된 저장공간의 주소가 들어간다.
		// = : 대입연산자 : heap영역에 할당된 저장공간의 주소를 변수에 넣는다.
		//new : heap영역에 지정된 타입의 크기만큼 배열을 만들어라.
		// int[10] : 배열로 만들어질 타입과 크기가 설정
		
		
		int[] s = new int[10];
		System.out.println(s.length); // s.length -> 10
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
			//배열은 자동 초기화
		}
		System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + 1 + " ");
		}
		
	}//main

}//class
