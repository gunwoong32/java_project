package 배열응용;

import java.util.Scanner;

public class 배열문제_전화번호입력_공백제거 {

	public static void main(String[] args) {

		// 전화번호입력>> 011-245-1234
		// 양쪽공백을 제거하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력해주세요>>");
		String num = sc.next();
//		String num = "  011-245-1234  ";
		String num2 = num.trim();
		String num3 = num2.replace("-", "");
		System.out.println(num2);
		System.out.println(num3); // 0112451234

		// -을 기준으로 분리해내세요.(String[])
		String[] num4 = num2.split("-");
		for (int i = 0; i < num4.length; i++) {
			System.out.print(num4[i]);
		}
		System.out.println();
		// 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple
		if (num4[0].equals("011")) {
			System.out.println("SK");
		} else if (num4[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		// 두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
		if (num4[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		// 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
		if (num3.length() >= 10) {
			System.out.println("유효한 전화번호");
			// 전체 전화번호의 길이가 10글자 미만이면 유효하지 않은 전화번호
		} else {
			System.out.println("유효하지 않은 전화번호");
		}

	}

}
