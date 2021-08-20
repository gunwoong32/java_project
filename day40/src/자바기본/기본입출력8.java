package 자바기본;

import java.util.Random;

public class 기본입출력8 {
//Random 클래스를 사용하여 시작할값(0~) 종료할값(1000~)을 발생시키고 3의배수만 더해보세요
//Hint : r.nextInt(10) : 0~9
//Hint : r.nextInt(10) + 1 : 1~10

	public static void main(String[] args) {
		Random r = new Random(9); // 시드값
		int num1 = r.nextInt(100); // 0~99
		int num2 = r.nextInt(10) + 1000; // 1000~1009
		int sum = 0;
		for (int i = num1; i < num2; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);

	}// main
}// class
