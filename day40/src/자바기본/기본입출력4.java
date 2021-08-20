package 자바기본;

import java.util.Scanner;

public class 기본입출력4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int jumsu[]= new int[5];
		// = int jumsu[] = {0,0,0,0,0};	//배열은 자동초기화됨
		//횟수를 정하고 반복하고자 하는 경우에는 카운트초기값, 조건식, 증감식

		int i2 =0;	  //카운트초기값
		while(true) { //반복할 조건
			System.out.print("오늘 온도는 몇도인가요? ");
			int temp = sc.nextInt();
			if (temp>=30) {
				System.out.println("너무 더워요");
			} else {
				System.out.println("괜찮아요");
			}
			jumsu[i2] = temp;
			sum = sum + temp;
			i2++;	 //증감식
			if (i2 == 5) {
				break;
			}
		}
			double avg = sum / 5.0;	//cpu가 ram에 있는 것을 가져다가 타입을 바꿈
			System.out.println("평균은 " + avg);
			System.out.println("--------------");
			for (int i = 0; i < jumsu.length; i++) {
				System.out.print(jumsu[i] +" ");
				
			}
			//자바에서는 정수끼리의 연산은 무조건 정수
			//자바에서는 하나라도 실수이면, 연산의 결과는 무조건 실수
	}
}
	
	
			


		

