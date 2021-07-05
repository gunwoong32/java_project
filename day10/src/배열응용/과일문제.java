package 배열응용;

import java.util.Scanner;


public class 과일문제 {

	public static void main(String[] args) {
		
		//사과/바나나는 2천원, 포도/키위는 3천원
		 
		String fruit [] = {"종료","사과","바나나","포도","키위"};
		int [] count = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("==================");
			System.out.print("좋아하는 과일은? 1)사과, 2)바나나, 3)포도, 4)키위, 0)종료>>");
			int b = sc.nextInt();
			System.out.println(fruit[b] + "가 선택되었습니다.");
			
			if (b == 0) {
				System.out.println("시스템이 종료됩니다");
				for (int i = 1; i < count.length; i++) {
					System.out.println(fruit[i]+ ": " + count[i] + "개");
					
				}
			//	System.out.println("구매하려면 전체 금액은 " +total+ "원입니다");
			}
			System.out.println("==================");
			
					
			
			
			
		}//while
		
	}//main

}//class