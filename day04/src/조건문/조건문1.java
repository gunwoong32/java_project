package 조건문;

public class 조건문1 {

	public static void main(String[] args) {

		// 1. 입력
		int jumsu = 77;

		// 2. 처리
		String result = null; // 변수의 초기화를 시켜놓는다.
		if (jumsu >= 90) {
			result = "A학점";
		} else if (jumsu >= 80) {
			result = "B학점";
		} else if (jumsu >= 70) {
			result = "C학점";
		} else {
			result = "D학점";

		}

		// 3. 출력
		System.out.println(result);

	}

}
