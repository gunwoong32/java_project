package 복습;

import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class 부품사용방법 {

	public static void main(String[] args) {
		// 망치
		// 너무 자주 사용하여 RAM에 이미 들어가있음.
		// 클래스 이름으로 바로 사용가능.
		// Integer , Double, System, JOptionPane.
		// 기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고 있는지 여부.
		// 함수를 가지고 있는 부품을 선택.

		// 벽돌
		//
//		Date date;
//		date = new Date();
		// Date라는 부품을 복사해서 RAM에 변수를 만들어 저장해둠.
		// CPU는 모든 부품을 RAM에 가져다놓고 조립한다.
		// Date date; => 저장된타입 변수명;(선언)
		// 선언 : RAM에 저장공간을 만드는 것.

		Date date = new Date(); // 위 두줄과 같음 변수명 소문자로 만들기 권장.

//		Random r = new Random();
//		Scanner sc = new Scanner(System.in); // 키보드로 입력, 입력값이 있어야함[system.in]

		int hour = date.getHours(); // 10
		System.out.println("현재 시각은 " + hour + "시");
		
		// 함수는 반환이 있는 것이 있고 없는 것이 있다.
		// 반환을 return이라고 부른다.
		// 반환이 있는 함수만 프린트가 가능하다.
		
		System.out.println(date.getMinutes());
		//System.out.println(System.out.println());
		//반환값이 없는 경우에는 void라고 써있다. void 없다라는 의미.
		
		
		
		
		
		
		
		
		
		
		
		

	}// main

}// class
