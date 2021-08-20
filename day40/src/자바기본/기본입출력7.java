package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 기본입출력7 {

	public static void main(String[] args) {
		// 1. 시작할 값 입력, 종료할 값 입력
		// 2. 5의 배수만 더해서 출력할것
		// 3. 5의 배수의 개수
		// 4. 5의 배수의 목록
		// 5. 5의 배수의 평균값
		Scanner sc = new Scanner(System.in);
		/* 변수 선언 */
		int sum = 0;
		int count = 0;
//		String list = "";
		ArrayList<Integer> list = new ArrayList<>();
		/* 입력 */
		System.out.print("시작할 값을 입력>> ");
		int num1 = sc.nextInt();
		System.out.print("종료할 값을 입력>> ");
		int num2 = sc.nextInt();
		/* 반복문 */
		while (num1 <= num2) {
			if (num1 % 5 == 0) {
				sum = sum + num1;
				count++;
				list.add(num1);
			}
			num1++;
		}
		double avg = sum/count;
		System.out.println("5의 배수를 더한값은 " + sum);
		//System.out.println("5의 배수의 개수는 " + count);
		System.out.println("5의 배수의 개수는 " + list.size());
		System.out.println("5의 배수의 목록은 " + list);
		System.out.println("5의 배수의 평균값은 " + avg);
		sc.close();
	}// main
}// class
