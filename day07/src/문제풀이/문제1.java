package 문제풀이;

public class 문제1 {

	public static void main(String[] args) {

// 		누적연습
// 문제1	33~222까지 모두 더해주세요.
		int sum = 0;
		for (int i = 33; i <= 222; i++) {
			sum = sum + i;
		System.out.println(i + ": " + sum);
		}
		System.out.println(sum);

// 문제2	55~4500까지 2씩 점프하면서 더하기
		int sum1 =0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		
// 문제3	0~6000까지 5씩 점프하면서 더하
		int sum2 =0 ;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum2 = sum2 + i;

		}
		System.out.println(sum2);

	}//		main

}//			class
