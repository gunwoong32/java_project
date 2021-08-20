package 자바기본;

import java.util.Random;

public class 문제만들기 {
//1번과 3번에서 나온 수 중에서 2번에서 나온 수만큼 배수를 더하기
//1번과 3번에서 나온 수 중에서 2번에서 나온 수의 배수를 더하기???
	public static void main(String[] args) {
		
		Random r = new Random(100);			//시드값100
		int num1 = r.nextInt(101); 			//0~100
		int num2 = r.nextInt(10)+1;			//1~10
		int num3 = r.nextInt(100) + 500;	//500~599
		int sum = 0;
		int count= 0;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		while (num1 < num3) {
			if (num1 % num2 == 0) {
				sum = sum + num1;
				count++;
			}
			num1++;
		}
		double avg = (double) sum / count;
		System.out.println();
		System.out.println("총합은 " + sum);
		System.out.println("개수는 " + count);
		System.out.println("평균은 " + avg);
		
		
	}//main
}//class
