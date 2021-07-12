package 배열생성;

import java.util.Iterator;

public class 기본형_배열3 {

	public static void main(String[] args) {

		//1 .int 크기 5인 배열을 생성해보세요.
		//2 .배열의 크기를 프린트해보세요.
		//3. 배열의 첫번째 값에 100을 넣어서, 프린트해보세요.
		//4. 배열의 마지막 위치에 500을 넣어서 프린트해보세요.
		//5. 배열의 3번재 위치에 200을 넣어서 프린트해보세요.
		//6. 배열의 전체 데이터를 프린트해보세요
		//7. 배열의 전체 데이터를 인덱스와 함께 프린트해보세요.
		//8. 그림으로 그려보세요.
		
		
		int [] s = new int[5];
		System.out.println(s.length);
		System.out.println();
		s[0] = 100;
		s[2] = 200;
		s[4] = 500;
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
			
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
			System.out.print(" " + s[i]+ " ");
		}
		System.out.println();
		System.out.println(s);
	
	}//main

}//class
