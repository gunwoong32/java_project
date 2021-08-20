package 자바기본;

import java.util.Scanner;

public class 기본입출력4_문제내기 {

	public static void main(String[] args) {
		//배열을 이용한 문제
		//90~99년생 띠 찾아서 배열에 넣기
		Scanner sc = new Scanner(System.in);
		int sign1[] = new int [10];
		String result[] = new String [10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("출생년도를 입력해주세요 90~99 ");
			int sign = sc.nextInt();
			if (sign == 90) {
				result[i] = "말띠";
				System.out.println("말띠입니다.");
			} else if (sign == 91) { //말 양 원숭이 닭 개 돼지 쥐 소 호랑이 토끼
				result[i] = "양띠";
				System.out.println("양띠입니다.");
			} else if (sign == 92) {
				result[i] = "원숭이띠";
				System.out.println("원숭이띠입니다.");
			} else if (sign == 93) {
				result[i] = "닭띠";
				System.out.println("닭띠입니다.");
			} else if (sign == 94) {
				result[i] = "개띠";
				System.out.println("개띠입니다.");
			} else if (sign == 95) {
				result[i] = "돼지띠";
				System.out.println("돼지띠입니다.");
			} else if (sign == 96) {
				result[i] = "쥐띠";
				System.out.println("쥐띠입니다.");
			} else if (sign == 97) {
				result[i] = "소띠";
				System.out.println("소띠입니다.");
			} else if (sign == 98) {
				result[i] = "호랑이띠";
				System.out.println("호랑이띠입니다.");
			} else if (sign == 99) {
				result[i] = "토끼띠";
				System.out.println("토끼띠입니다.");
			}else {
				System.out.println("90~99만 입력하세요");
			}
			sign1[i] = sign;
		} 
		
		for (int i = 0; i < sign1.length; i++) {
			System.out.print(sign1[i] + " ");
			System.out.println(result[i] + " ");
		}
		
		
		
		
		
		
	}//main
}
	
	
			


		

