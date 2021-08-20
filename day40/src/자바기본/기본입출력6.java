package 자바기본;

import java.util.Scanner;

public class 기본입출력6 {

	public static void main(String[] args) {
		
		//시작은 100부터 시작, 시작 500이 되기 전까지 전체를 더해보세요
		//while(true)일 경우 break해주어야한다.
		int sum = 0;
		int i2 =100;	  //카운트초기값
		while(true) { //반복할 조건
			sum = sum + i2;
			i2++;	 //증감식
			if (i2==500) {
				break;
			}
		}
		System.out.println(sum);
		
			
		
			//자바에서는 정수끼리의 연산은 무조건 정수
			//자바에서는 하나라도 실수이면, 연산의 결과는 무조건 실수
	}
}
	
	
			


		

