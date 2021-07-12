package 문제풀이;

public class 반복해서누적시키기 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("sum: " + sum);
			sum = sum + i;

		}

		System.out.println(sum);

	}

}
