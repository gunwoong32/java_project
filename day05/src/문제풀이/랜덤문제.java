package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제 {

	public static void main(String[] args) {

		//1. 랜덤문제
			//랜덤한 숫자를 2개 발생시켜서 첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요!
			//두번째 랜덤한 숫자가 더 크면 두번째가 더 커요!
		Random r = new Random(); // 임의의 수를 발생시킴. 시드값을 넣어서 값을 고정시킨
		
		
		int num1 = r.nextInt(100) + 10; // 10부터 109까지의 값이 나온다. 
		int num2 = r.nextInt(10); 0부터 9까지의 값이 나온다.
		
		if (num1 > num2) {
			System.out.println("첫번째가 더 커요!");
			
		} else {
			System.out.println("두번째가 더 커요!");

		}
		
		
		
	}//main

}//class
