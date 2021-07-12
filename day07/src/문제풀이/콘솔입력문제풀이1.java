package 문제풀이;

import java.util.Scanner;

public class 콘솔입력문제풀이1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("안정성 점수를 입력하세요>>");		
		Double n1 = sc.nextDouble();
		Double n4 = n1 * 0.3;
		System.out.println("안정성 점수(30%) " + n4);

		System.out.print("속도 점수를 입력하세요>>");		
		Double n2 = sc.nextDouble();
		Double n5 = n2 * 0.5;
		System.out.println("속도 점수(50%) " + n5);
		
		System.out.print("연비 점수를 입력하세요>>");		
		Double n3 = sc.nextDouble();
		Double n6 = n3 * 0.2;
		System.out.println("연비 점수(20%) " + n6);
		
		double sum = n4 + n5 + n6;
		
		System.out.println("---------------------------");
		
		String grade = null;
		
		if (sum>=90) {
			grade = "최우수";
		} else if (sum>=80) {
			grade = "우수";
		} else if (sum>=70) {
			grade = "보통";
		}else {
			grade ="미달";
		}
			System.out.println(sum + "점 " + grade + "입니다.");
			
//		위랑 아래랑 같아요
		
//		if (sum>=90) {
//			System.out.println(sum + "점 " +"최우수입니다.");
//			
//		} else if (sum>=80) {
//			System.out.println(sum + "점 " +"우수입니다.");
//			
//		} else if (sum>=70) {
//			System.out.println(sum + "점 " +"보통입니다.");
//		}else {
//			System.out.println(sum + "점 " +"미달입니다.");
//			
//		}{
//
//		}
		
		
		
	}//main

}//class
