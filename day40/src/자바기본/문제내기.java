package 자바기본;

import java.util.Scanner;

public class 문제내기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("한식을 좋아하나요? true/false");
			boolean kf = sc.nextBoolean();
			System.out.println("중식을 좋아하나요? true/false");
			boolean cf = sc.nextBoolean();
			if (kf == true && cf == true) {
				System.out.println("김치찌개와 자장면을 추천합니다");
			} else if (kf ==true && cf == false) {
				System.out.println("김치찌개를 추천합니다");
			} else if (kf == false && cf == true) {
				
				System.out.println("자장면을 추천합니다.");
			}else {
				System.out.println("양식을 추천합니다");
			}
			 
		}
	}
}
		