package 문제풀이;

public class 문제2 {

	public static void main(String[] args) {
		// 1부터 1000까지 3씩 점프해주세요
		// 만약 더한값이 100이 넘으면 그만
		// 5의 배수는 더하지 않습니다.
		
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum>100) {
				break;
			} 
			if (i % 5 ==0) {
				continue;	//이번 횟수를 제외하고 for문은 계속 돈다.
			}
			sum = sum +i;
			count++;
			
		
		System.out.println(sum);
		System.out.println(count);
		
	
	}// for문
}// main

}// class
