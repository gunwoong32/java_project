package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {
		// 1부터 10까지 더해봅시다.
		int sum = 0; 	// 초기화 시켜야 좋음.
		for (int i = 1; i <= 100; i++) {
			// 1 + 2 + 3 + ... + 10
			sum = sum + i;	// 1 = 0 + 1
							// 3 = 1 + 2
							// 6 = 3 + 3
							// 10= 6 + 4
			
		}
		System.out.println(sum);
	}//main

}//class
